<#include "security.ftl">

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

<#macro eqProp message>
    <div class="table-responsive-lg">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col" class="h6">#</th>
            <th scope="col" class="h6">Оборудование</th>
            <th scope="col" class="h6">Расположение</th>
            <th scope="col" class="h6">Номер блока</th>
            <th scope="col" class="h6">Система автомат</th>
            <th scope="col" class="h6">Номер усо</th>
            <th scope="col" class="h6">Номер ci</th>
            <th scope="col" class="h6">Ход запорной арматуры</th>
            <th scope="col" class="h6">скорость модбас</th>
            <th scope="col" class="h6">Адрес модбас</th>
            <th scope="col" class="h6">Настройки модбас</th>
            <th scope="col" class="h6">максимальный момент</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>${message.oborudovaiye}</td>
            <td>${message.raspologeniye}</td>
            <td>${message.nomerBloka}</td>
            <td>${message.sistemaAvtomatiki}</td>
            <td>${message.nomerUso}</td>
            <td>${message.nomerCi}</td>
            <td>${message.hodZapornoyArmaturi}</td>
            <td>${message.modbusSkorost}</td>
            <td>${message.modbusAddress}</td>
            <td>${message.modbusNastroyki}</td>
            <td>${message.maxTorque}</td>
        </tr>
        </tbody>
    </table>
    </div>
</#macro>

<#macro eqPropMiddle message>
    <div class="table-responsive-lg">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col" class="h6">#</th>
                <th scope="col" class="h6">Момент на закрытие</th>
                <th scope="col" class="h6">Стартовый момент на открытие</th>
                <th scope="col" class="h6">Момент открытия</th>
                <th scope="col" class="h6">Стартовый момент на закрытие</th>
                <th scope="col" class="h6">Тип задвижки</th>
                <th scope="col" class="h6">Время на переход в сон</th>
                <th scope="col" class="h6">Наличие дискр команд</th>
                <th scope="col" class="h6">Позиция открытия</th>
                <th scope="col" class="h6">Позиция закрытия</th>
                <th scope="col" class="h6">Гориз положение</th>
                <th scope="col" class="h6">Вертик положение</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">2</th>
                <td>${message.closeTorque}</td>
                <td>${message.startOpenTorque}</td>
                <td>${message.openTorque}</td>
                <td>${message.startCloseTorque}</td>
                <td>${message.zdType}</td>
                <td>${message.timeToSleepMode}</td>
                <td>${message.nalichieDiskretCommands}</td>
                <td>${message.openPosition}</td>
                <td>${message.closePosition}</td>
                <td>${message.horizontalPologeniye}</td>
                <td>${message.verticalPologeniye}</td>
            </tr>
            </tbody>
        </table>
    </div>
</#macro>

<#macro eqPropLast message>
    <div class="table-responsive-lg">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col" class="h6">#</th>
                <th scope="col" class="h6">Структурная схема</th>
                <th scope="col" class="h6">Шкаф оборудования</th>
                <th scope="col" class="h6">Страница стр-ной схемы</th>
                <th scope="col" class="h6">Станица ШУ</th>
                <th scope="col" class="h6">Дополнительная информация</th>
                <th scope="col" class="h6">Дополнительная информация</th>
                <th scope="col"> </th>
                <th scope="col"> </th>
                <th scope="col"> </th>
                <th scope="col"> </th>
                <th scope="col"> </th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">3</th>
                <td>${message.structuralScheme}</td>
                <td>${message.equipmentShkaf}</td>
                <td>${message.pageOnStructuralScheme}</td>
                <td>${message.usoPage}</td>
                <td>${message.dummy}</td>
                <td>${message.dummy2}</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
</#macro>

<#macro delProperty message>
    <#if isAdmin>
        <form action="/delete" method="post">
            <input type="hidden" name="messageId" value="${message.id}">
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit" class="btn btn-primary ml-2"> Удалить запись </button>
        </form>
    </#if>
</#macro>