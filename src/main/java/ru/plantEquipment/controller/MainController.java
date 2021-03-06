package ru.plantEquipment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ru.plantEquipment.domain.Message;
import ru.plantEquipment.domain.User;
import ru.plantEquipment.repos.MessageRepo;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class MainController {
    @Value("${upload.path}")
    private String uploadPath;

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(@RequestParam(required = false, defaultValue = "") String filter,
                       Model model) {
        Iterable<Message> messages = messageRepo.findAll();

        if (filter != null && !filter.isEmpty()) {
            messages = messageRepo.findByOborudovaiye(filter);
        } else {
            messages = messageRepo.findAll();
        }

            model.addAttribute("messages", messages);
            model.addAttribute("filter", filter);

        return "main";
    }

    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam Map<String,String> map,
            Map<String, Object> model,
            @RequestParam("file") MultipartFile file
    ) throws IOException {
        Message message = new Message(map, user);

        if (file != null && !file.getOriginalFilename().isEmpty()) {
            File uploadDir = new File(uploadPath);

            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
            int len = file.getOriginalFilename().length();
            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + file.getOriginalFilename().substring(len-4, len);

            file.transferTo(new File(uploadPath + "/" + resultFilename));

            message.setFilename(resultFilename);
        }

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @GetMapping ("/delete")
    public String deleteEquipment(@RequestParam(required = false, defaultValue = "") String message, Map<String, Object> model) {
        messageRepo.deleteAll(messageRepo.findByOborudovaiye(message));
        return "main";
    }

    }
