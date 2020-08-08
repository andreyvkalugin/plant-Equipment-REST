<#macro insertData>
    <div class="form-group mt-3">
        <input type="text" class="form-control" name="oborudovaiye" placeholder="Введите оборудование" />
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="raspologeniye" placeholder="Расположение">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="nomerBloka" placeholder="Номер блока">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="sistemaAvtomatiki" placeholder="Система автоматики">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="nomerUso" placeholder="Номер УСО">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="nomerCi" placeholder="Номер инт. модуля Ci">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="hodZapornoyArmaturi" placeholder="Ход запорной арм-ры">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="modbusSkorost" placeholder="Modbus скорость">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="modbusAddress" placeholder="Modbus адрес">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="modbusNastroyki" placeholder="Modbus настройки">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="maxTorque" placeholder="максимальный момент">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="closeTorque" placeholder="момент на закрытие">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="startOpenTorque" placeholder="стартовый момент на открытие">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="openTorque" placeholder="момент на открытие">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="startCloseTorque" placeholder="стартовый момент на закрытие">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="zdType" placeholder="тип задвижки">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="timeToSleepMode" placeholder="выдержка на сон">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="nalichieDiskretCommands" placeholder="наличие дискретных команд">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="openPosition" placeholder="позиция открытия">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="closePosition" placeholder="позиция закрытия">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="horizontalPologeniye" placeholder="горизонтальное положение">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="verticalPologeniye" placeholder="вертикальное положение">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="structuralScheme" placeholder="структурная схема">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="equipmentShkaf" placeholder="шкаф оборудования">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="pageOnStructuralScheme" placeholder="страница стр. схемы">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="usoPage" placeholder="страница схемы ШУ">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="dummy" placeholder="Дополнительная инф-ция">
    </div>
    <div class="form-group">
        <input type="text" class="form-control" name="dummy2" placeholder="Дополнительная инф-ция">
    </div>
</#macro>

<#macro equipmentProperty message>
    <div class="m-2">
        <span>${message.oborudovaiye}</span>
        <span>${message.raspologeniye}</span>
        <span>${message.nomerBloka}</span>
        <span>${message.sistemaAvtomatiki}</span>
        <span>${message.nomerUso}</span>
        <span>${message.nomerCi}</span>
        <span>${message.hodZapornoyArmaturi}</span>
        <span>${message.modbusSkorost}</span>
        <span>${message.modbusAddress}</span>
        <span>${message.modbusNastroyki}</span>
        <span>${message.maxTorque}</span>
        <span>${message.closeTorque}</span>
        <span>${message.startOpenTorque}</span>
        <span>${message.openTorque}</span>
        <span>${message.startCloseTorque}</span>
        <span>${message.zdType}</span>
        <span>${message.timeToSleepMode}</span>
        <span>${message.nalichieDiskretCommands}</span>
        <span>${message.openPosition}</span>
        <span>${message.closePosition}</span>
        <span>${message.horizontalPologeniye}</span>
        <span>${message.verticalPologeniye}</span>
        <span>${message.structuralScheme}</span>
        <span>${message.equipmentShkaf}</span>
        <span>${message.pageOnStructuralScheme}</span>
        <span>${message.usoPage}</span>
        <span>${message.dummy}</span>
        <span>${message.dummy2}</span>
    </div>
</#macro>