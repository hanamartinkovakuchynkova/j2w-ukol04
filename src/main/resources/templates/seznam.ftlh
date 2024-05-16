[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="seznam">
    [#list businessCardList as businessCard]
        <div class="seznam">
            <a href="/detail/${businessCard_index}">
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
                            [#if businessCard.webAddress??]
                                <div><i class="las la-globe"></i> <span>${businessCard.webAddress}</span></div>
                            [/#if]
                        </div>
                    </div>
                </div>
            </a>
        </div>
    [/#list]

    <a href="/nova">
        <div class="vizitka vizitka--nova">
            <svg width="100" height="100">
                <rect width="20" height="100" x="40" y="0" fill="white"/>
                <rect width="100" height="20" x="0" y="40" fill="white"/>
            </svg>
        </div>
    </a>
</div>
</body>
</html>
