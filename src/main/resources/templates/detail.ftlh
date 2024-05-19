[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${businessCard.name}</div>
        <div class="firma">${businessCard.company}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${businessCard.street}</div>
                <div>${businessCard.cityZipCode}</div>
            </div>
            <div class="kontakty">
                [#if businessCard.email??]
                    <div><i class="las la-at"></i> <span>${businessCard.email}</span></div>
                [/#if]
                [#if businessCard.telephone??]
                    <div><i class="las la-phone-alt"></i> <span>${businessCard.telephone}</span></div>
                [/#if]
                <div><i class="las la-globe"></i> <span>${businessCard.webAddress}</span></div>
            </div>
        </div>
    </div>
    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${businessCard.address?url("UTF-8")}" width="100%" height="100%" frameborder="0"></iframe>
    </div>

    <nav>
        <a href="/">◂ zpět na seznam</a>
    </nav>

    <form action="/delete" method="post">
        <input type="hidden" name="id" value="${businessCard.id}">
        <button type="submit">Smazat</button>
    </form>

</div>
</body>
</html>
