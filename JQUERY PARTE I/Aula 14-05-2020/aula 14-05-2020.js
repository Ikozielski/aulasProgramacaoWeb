// site hurb.com/br/
let Json = [];
$.each($(".product-card"), function() {
    titulo = $(this).find(".product-card__title").text();
    desconto = $(this).find(".promotion-tag-discount").text();
    valor = $(this).find(".promotion-price").text();
    Json.push({titulo,desconto,valor});
});
console.log(JSON.stringify(Json, null, 2));