package com.example.producer

import com.example.producer.KafkaProducerConfiguration.Companion.TOPIC
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
public class KafkaProducerController(val kafkaTemplate: KafkaTemplate<String, String>) {

// TODO: Should be post
//    @GetMapping("/person/{name}")
//    fun getPerson(@PathVariable name: String) {
//
//
//
//        val person = personRepository.findById(name)
//        val person = Optional.of(name)
//
//        return if (person.isPresent) {
//            kafkaTemplate.send(TOPIC, "GET /person/name OK > $name")
//            ResponseEntity.ok(person.get())
//        } else {
//            kafkaTemplate.send(TOPIC, "GET /person/name BadRequest > $name")
//            ResponseEntity.badRequest().body(null)
//        }
//    }


    fun sendMessage() {
        val LOG = LoggerFactory.getLogger("com.example.producer")
        val message = MessageBuilder.withPayload("{\"type\":\"OrderUpdateReturn\",\"attributes\":[{\"name\":\"MailTo\",\"type\":\"String\",\"value\":\"lars.looijenga@gmail.com\"},{\"name\":\"topLevelDomain\",\"type\":\"TopLevelDomain\",\"value\":\"NL\"}],\"refundsData\":{\"type\":\"RefundsDataRO\",\"refundsList\":[{\"refundType\":\"RETURN\",\"refundEntries\":[{\"qty\":1,\"unitExVAT\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"id\":3309177,\"refundedCash\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"totalRefundedCash\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"createdTS\":\"2018-03-2301:25:00\",\"unitIncVAT\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"unitVAT\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"returnCodeAssociations\":[{\"qty\":1,\"returnDate\":\"2018-03-2211:10:32\",\"reasonCode\":\"90\"}],\"type\":\"RefundEntryRO\",\"customerOrderCharge\":{\"type\":\"CustomerOrderChargeRO\",\"entryType\":\"SHIPPING\",\"articleDescription\":\"verzendkosten\",\"customerOrderEntryId\":6937325,\"articleNumber\":\"936409000000000\"},\"refundedPointsInCash\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"refundedPoints\":0},{\"qty\":1,\"unitExVAT\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":15.03},\"id\":3309178,\"refundedCash\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":18.19},\"totalRefundedCash\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":18.19},\"createdTS\":\"2018-03-2301:25:00\",\"unitIncVAT\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":18.19},\"unitVAT\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":3.16},\"customerOrderLine\":{\"size\":\"86\",\"customerOrderEntryId\":14165432,\"articleNumber\":\"772609013909086\",\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609013909074_pro_flt_frt_01_1108_1528_2661896.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609013909074_pro_flt_frt_01_1108_1528_2661896.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"entryType\":\"LINE\",\"articleDescription\":\"PetitBateauRompermetprintin3-pack\",\"manufacturer\":\"\",\"displayName\":\"PetitBateauRompermetprintin3-pack\",\"type\":\"CustomerOrderLineRO\",\"color\":\"Gebrokenwit\"},\"returnCodeAssociations\":[{\"qty\":1,\"returnDate\":\"2018-03-2211:10:32\",\"reasonCode\":\"90\"}],\"type\":\"RefundEntryRO\",\"refundedPointsInCash\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"refundedPoints\":0}],\"refundPayments\":[{\"type\":\"RefundPaymentRO\",\"paymentType\":\"IDEAL\",\"paymentSubType\":\"ideal\",\"pspReference\":\"***************\",\"refundState\":\"REFUND_CREATED\"}],\"refundId\":1716457,\"type\":\"RefundRO\",\"partOfCurrentUpdate\":true}]},\"order\":{\"gifting\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"salesTax\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.83},\"promotionTotal\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shippingTaxesAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"buckets\":{\"name\":\"buckets\",\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"OrderBucket\",\"type\":\"ResourceCollection\",\"elements\":[{\"orderLineItems\":{\"name\":\"orderLineItems\",\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"OrderLineItem\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":\"orderLineItem\",\"quantity\":1,\"size\":\"86\",\"fulfillmentStatus\":\"new\",\"total\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":18.19},\"recommendedPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shortDescription\":\"Rompermetprintin3-pack\",\"color\":\"Gebrokenwit\",\"type\":\"OrderLineItem\",\"linePromotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"LinePromotionRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":null,\"type\":\"LinePromotionRO\",\"promotionDescription\":\"stippenkorting30%\"}]},\"promotionLink\":[],\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609013909074_pro_flt_frt_01_1108_1528_2661896.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609013909074_pro_flt_frt_01_1108_1528_2661896.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"displayName\":\"PetitBateau\",\"listPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":25.99},\"surcharges\":[],\"sku\":\"772609013909086\",\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":18.19},\"manufacturerName\":\"PetitBateau\"},{\"name\":\"orderLineItem\",\"quantity\":1,\"size\":\"86\",\"fulfillmentStatus\":\"new\",\"total\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":16.73},\"recommendedPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shortDescription\":\"Romperinunienmetsterrenprintin3-pack\",\"color\":\"Blauw\",\"type\":\"OrderLineItem\",\"linePromotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"LinePromotionRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":null,\"type\":\"LinePromotionRO\",\"promotionDescription\":\"stippenkorting30%\"}]},\"promotionLink\":[],\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609013785074_pro_flt_frt_01_1108_1528_2657081.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609013785074_pro_flt_frt_01_1108_1528_2657081.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"displayName\":\"PetitBateau\",\"listPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":23.9},\"surcharges\":[],\"sku\":\"772609013785086\",\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":16.73},\"manufacturerName\":\"PetitBateau\"},{\"name\":\"orderLineItem\",\"quantity\":1,\"size\":\"92\",\"fulfillmentStatus\":\"new\",\"total\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":6.96},\"recommendedPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shortDescription\":\"Romperinunimetrondehals\",\"color\":\"Wit\",\"type\":\"OrderLineItem\",\"linePromotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"LinePromotionRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":null,\"type\":\"LinePromotionRO\",\"promotionDescription\":\"stippenkorting30%\"}]},\"promotionLink\":[],\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609014910056_pro_flt_frt_01_1108_1528_1413213.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609014910056_pro_flt_frt_01_1108_1528_1413213.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"displayName\":\"PetitBateau\",\"listPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":9.95},\"surcharges\":[],\"sku\":\"772609014910092\",\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":6.96},\"manufacturerName\":\"PetitBateau\"},{\"name\":\"orderLineItem\",\"quantity\":1,\"size\":\"92\",\"fulfillmentStatus\":\"new\",\"total\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.53},\"recommendedPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shortDescription\":\"Gestreepteromperin2-pack\",\"color\":\"Gebrokenwit\",\"type\":\"OrderLineItem\",\"linePromotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"LinePromotionRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":null,\"type\":\"LinePromotionRO\",\"promotionDescription\":\"stippenkorting30%\"}]},\"promotionLink\":[],\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609015909080_pro_flt_frt_01_1108_1528_2671269.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609015909080_pro_flt_frt_01_1108_1528_2671269.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"displayName\":\"PetitBateau\",\"listPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":20.76},\"surcharges\":[],\"sku\":\"772609015909092\",\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.53},\"manufacturerName\":\"PetitBateau\"},{\"name\":\"orderLineItem\",\"quantity\":1,\"size\":\"86\",\"fulfillmentStatus\":\"new\",\"total\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.53},\"recommendedPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shortDescription\":\"Rompermetdessinin2-pack\",\"color\":\"Gebrokenwit\",\"type\":\"OrderLineItem\",\"linePromotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"LinePromotionRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":null,\"type\":\"LinePromotionRO\",\"promotionDescription\":\"stippenkorting30%\"}]},\"promotionLink\":[],\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609016629062_pro_flt_frt_01_1108_1528_2717077.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609016629062_pro_flt_frt_01_1108_1528_2717077.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"displayName\":\"PetitBateau\",\"listPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":20.76},\"surcharges\":[],\"sku\":\"772609016629086\",\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.53},\"manufacturerName\":\"PetitBateau\"},{\"name\":\"orderLineItem\",\"quantity\":1,\"size\":\"86\",\"fulfillmentStatus\":\"new\",\"total\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.53},\"recommendedPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"shortDescription\":\"Gestreepteromperin2-pack\",\"color\":\"Gebrokenwit\",\"type\":\"OrderLineItem\",\"linePromotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"LinePromotionRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":null,\"type\":\"LinePromotionRO\",\"promotionDescription\":\"stippenkorting30%\"}]},\"promotionLink\":[],\"thumbnail\":{\"name\":null,\"title\":\"product-images/077/260/11_0772609015909080_pro_flt_frt_01_1108_1528_2671269.jpg\",\"description\":null,\"uri\":\"https://cdn-static.debijenkorf.nl/INTERSHOP/static/WFS/dbk-shop-Site/-/dbk-shop/nl_NL/product-images/077/260/11_0772609015909080_pro_flt_frt_01_1108_1528_2671269.jpg\",\"attributesSimple\":{},\"type\":\"Link\",\"attributes\":null,\"relation\":null},\"displayName\":\"PetitBateau\",\"listPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":20.76},\"surcharges\":[],\"sku\":\"772609015909086\",\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.53},\"manufacturerName\":\"PetitBateau\"}]},\"shippingDest\":{\"company\":\"\",\"street\":\"Haringkade\",\"title\":\"Mevr\",\"lastName\":\"Toncheva\",\"mobile\":\"064*******4\",\"postalCode\":\"1111AA\",\"addressNr\":\"41\",\"street3\":null,\"street2\":null,\"secondName\":\"Antonova\",\"phoneHome\":null,\"name\":\"haven\",\"preferredShippingAddress\":null,\"city\":\"Katwijk\",\"defaultAddress\":null,\"companyName2\":null,\"addressName\":\"haven\",\"type\":\"Address\",\"email\":null,\"countryCode\":\"NL\",\"id\":\"4uAKLxGDkTcAAAFibIkEcU9P\",\"firstName\":\"Ivayla\",\"state\":null},\"shippingMethod\":\"Thuisbezorgen\",\"orderGifting\":{\"name\":null,\"type\":\"OrderGiftingRO\",\"giftingCost\":null},\"orderShippingBucket\":{\"name\":null,\"type\":\"orderShippingBucket\",\"shippingMethod\":{\"name\":null,\"id\":null,\"nameInConfirmationEmail\":\"Besteldeartikelen\",\"shippingMethodType\":null,\"introInConfirmationEmail\":\"Uontvangteene-mailzodraonderstaandeartikelenzijnverzonden.\",\"displayName\":\"Thuisbezorgen\",\"type\":\"OrderShippingMethodRO\",\"options\":null,\"sequenceNumber\":0},\"price\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0}},\"type\":\"OrderBucket\"}]},\"subTotalAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":85.47},\"promotions\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":null,\"type\":\"ResourceCollection\",\"elements\":[]},\"giftCardsCertificates\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"shippingPrice\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"shippingPromotionAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"totalAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":85.47},\"paymentMethodDetails\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"PaymentMethodDetailRO\",\"type\":\"ResourceCollection\",\"elements\":[{\"paymentAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":85.47},\"type\":\"PaymentMethodDetailRO\",\"paymentMethod\":\"ideal\",\"name\":null,\"paymentReference\":\"*****************\"}]},\"orderLink\":null,\"orderPromotionTotal\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"name\":null,\"status\":\"completed\",\"taxesDutiesAndFeesAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":14.83},\"date\":\"2018-03-2209:03:55\",\"destCountryCode\":\"NL\",\"doctumentNo\":\"11111112\",\"type\":\"Order\",\"orderID\":\"GqAKLxGDCNQAAAFiXYkEcU9P\",\"invoiceToAddress\":{\"company\":\"\",\"street\":\"Haringkade\",\"title\":\"Mevr\",\"lastName\":\"Tocheva\",\"mobile\":\"0646******4\",\"postalCode\":\"1111AA\",\"addressNr\":\"41\",\"street3\":null,\"street2\":null,\"secondName\":\"Antonova\",\"phoneHome\":null,\"name\":\"ContactAddress\",\"preferredShippingAddress\":null,\"city\":\"Katwijk\",\"defaultAddress\":null,\"companyName2\":null,\"addressName\":\"ContactAddress\",\"type\":\"Address\",\"email\":\"anton.tonchev@accenture.com\",\"countryCode\":\"NL\",\"id\":\"SYUKLxGDDJcAAAFiZYkEcU9P\",\"firstName\":\"Ivayla\",\"state\":null},\"surchargeAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"N/A\",\"value\":0},\"paymentAmount\":{\"name\":null,\"type\":\"Money\",\"currencyMnemonic\":\"EUR\",\"value\":0},\"payment\":{\"name\":null,\"sortKeys\":null,\"total\":null,\"offset\":null,\"pageable\":null,\"amount\":null,\"elementType\":\"OrderPayment\",\"type\":\"ResourceCollection\",\"elements\":[{\"name\":\"ADYEN_PAYMENT_SERVICE\",\"status\":\"authorized\",\"number\":null,\"attributesSimple\":{},\"displayName\":\"ADYEN_PAYMENT_SERVICE\",\"type\":\"OrderPayment\",\"attributes\":null}]}}}")
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .setHeader("type", "OrderUpdateReturn".toByteArray())
                .build();
        kafkaTemplate.send(message);
        LOG.info("Sending message")
    }
}
