<#import "parts/common.ftl" as c>

<@c.page>
<div class="form-row">
    <div class="form-group col-md-6">
        <form method="get" action="/main" class="form-inline">
            <input type="text" name="filter" class="form-control" value="${filter!}" placeholder="Поиск по названию">
            <button type="submit" class="btn btn-primary ml-2">Поиск</button>
        </form>
        </div>
</div>
        <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
            Добавить новое оборудование
        </a>
    <div class="collapse" id="collapseExample">
            <div class="form-group">
                <form method="post" enctype="multipart/form-data">
                            <div class="form-group mt-3">
                                 <input type="text" class="form-control" name="text" placeholder="Введите сообщение" />
                            </div>
                            <div class="form-group">
                                  <input type="text" class="form-control" name="tag" placeholder="Тэг">
                            </div>
                            <div class="form-group">
                               <div class="custom-file">
                                   <input type="file" name="file" id="customFile">
                                   <label class="custom-file-label" for="customFile">Выбирете файл для загр.</label>
                               </div>
                            </div>
                           <input type="hidden" name="_csrf" value="${_csrf.token}" />
                           <div class="form-group">
                              <button type="submit" class="btn btn-primary">Добавить</button>
                           </div>
                </form>
            </div>
    </div>
    <#list messages as message>
        <div>
            <b>${message.id}</b>
            <span>${message.text}</span>
            <i>${message.tag}</i>
            <strong>${message.authorName}</strong>
                <div>
                    <#if message.filename??>
                       <img src="/img/${message.filename}">
                    </#if>
                </div>
        </div>
    <#else>
        No message
    </#list>
</@c.page>
