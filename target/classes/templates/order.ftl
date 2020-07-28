<#import "parts/common.ftl" as c>
<@c.page>
    <div>
        <div style="width: 50%"><img src="/images/${good.imageName}" class="card-img-top"></div>
        <div style="float: right; width: 50% ">
            <td>${good.goodName}</td>
            <td>${good.product_description}</td>
            <td>${good.price_selling}</td>
        </div>
    </div>
    <div class="d-flex p-2 bd-highlight">${good.product_description}</div>
    <button type="button" class="btn btn-primary" style="float:right;">Exaclty buy</button>
</@c.page>