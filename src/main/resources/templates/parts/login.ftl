<#macro login path isRegisterForm>
    <form action="${path}" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"> User Name : </label>
            <div class="col-sm-6">
                <input type="text" name="username" class="form-control" placeholder="User name"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"> Password : </label>
            <div class="col-sm-6">
                <input type="password" name="password" class="form-control" placeholder="Password"/>
            </div>
        </div>
        <#if isRegisterForm>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label"> Email : </label>
            <div class="col-sm-6">
                <input type="email" name="email" class="form-control" placeholder="email@email.com"/>
            </div>
        </div>
        </#if>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
          <#if !isRegisterForm> <a href="/registration">Add new user</a> </#if>
        <button type="submit" class="btn btn-primary"><#if isRegisterForm>Create user <#else> Sign in </#if> </button>
    </form>
</#macro>

<#macro logout>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit" class="btn btn-primary">Sign out</button>
    </form>
</#macro>
