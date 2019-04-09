package com.qanova2

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation3 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://www.qanovagroup.com")
		.inferHtmlResources()
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("es-ES,es;q=0.9,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_0 = Map(
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive")

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Proxy-Connection" -> "keep-alive")

	val headers_9 = Map(
		"Accept" -> "*/*",
		"Proxy-Connection" -> "keep-alive")

	val headers_13 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Proxy-Connection" -> "keep-alive")

	val headers_28 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Origin" -> "http://www.qanovagroup.com",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_41 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Origin" -> "http://www.qanovagroup.com",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_44 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://www.qanovagroup.com",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

    val uri2 = "http://www.gstatic.com/generate_204"

	val scn = scenario("RecordedSimulation3")
		.exec(http("RecordedSimulation3_0")
			.get(uri2 + "")
			.headers(headers_0))
		.pause(5)
		.exec(http("RecordedSimulation3_1")
			.get("/piloto")
			.headers(headers_1)
			.resources(http("RecordedSimulation3_2")
			.get("/piloto/style/reset.css?13-1-8-23")
			.headers(headers_2),
            http("RecordedSimulation3_3")
			.get("/piloto/style/template.css?13-1-8-23")
			.headers(headers_2),
            http("RecordedSimulation3_4")
			.get("/piloto/style/style.css?13-1-8-23")
			.headers(headers_2),
            http("RecordedSimulation3_5")
			.get("/piloto/style/menu.css?13-1-8-23")
			.headers(headers_2),
            http("RecordedSimulation3_6")
			.get("/piloto/pluginAppObj_01/custom.css")
			.headers(headers_2),
            http("RecordedSimulation3_7")
			.get("/piloto/imHeader_pluginAppObj_02/custom.css")
			.headers(headers_2),
            http("RecordedSimulation3_8")
			.get("/piloto/pcss/index.css?13-1-8-23-636555116381078681")
			.headers(headers_2),
            http("RecordedSimulation3_9")
			.get("/piloto/res/x5engine.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_10")
			.get("/piloto/res/jquery.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_11")
			.get("/piloto/imHeader_pluginAppObj_02/main.js")
			.headers(headers_9),
            http("RecordedSimulation3_12")
			.get("/piloto/pluginAppObj_01/main.js")
			.headers(headers_9),
            http("RecordedSimulation3_13")
			.get("/piloto/images/header_brand_es.38682.jpg")
			.headers(headers_13),
            http("RecordedSimulation3_14")
			.get("/piloto/images/pixabay-bb4b32c99a2f44435e.png")
			.headers(headers_13),
            http("RecordedSimulation3_15")
			.get("/piloto/images/White_twitter.png")
			.headers(headers_13),
            http("RecordedSimulation3_16")
			.get("/piloto/images/White_facebook-1-.png")
			.headers(headers_13),
            http("RecordedSimulation3_17")
			.get("/piloto/style/print.css?13-1-8-23")
			.headers(headers_2),
            http("RecordedSimulation3_18")
			.get("/piloto/images/youtube-1-.png")
			.headers(headers_13),
            http("RecordedSimulation3_19")
			.get("/piloto/menu/hor_main.png")
			.headers(headers_13),
            http("RecordedSimulation3_20")
			.get("/piloto/res/modernizr-custom.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_21")
			.get("/piloto/res/l10n.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_22")
			.get("/piloto/res/x5settings.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_23")
			.get("/piloto/res/x5cartengine.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_24")
			.get("/piloto/res/x5engine.deferrable.js?13-1-8-23")
			.headers(headers_9),
            http("RecordedSimulation3_25")
			.get("/piloto/menu/hor_main_h.png")
			.headers(headers_13),
            http("RecordedSimulation3_26")
			.get("/piloto/menu/hor_main_c.png")
			.headers(headers_13),
            http("RecordedSimulation3_27")
			.get("/piloto/res/imClose.png")
			.headers(headers_13)))
		.pause(12)
		.exec(http("RecordedSimulation3_28")
			.post("/piloto/imlogin.php")
			.headers(headers_28)
			.formParam("imUname", "nvivas")
			.formParam("imPwd", "qanova"))
		.pause(1)
		.exec(http("RecordedSimulation3_29")
			.get("/piloto/carga-de-informacion.php")
			.headers(headers_1)
			.resources(http("RecordedSimulation3_30")
			.get("/piloto/pcss/carga-de-informacion.css?13-1-8-23-636555116375453681")
			.headers(headers_2),
            http("RecordedSimulation3_31")
			.get("/piloto/res/date.gif")
			.headers(headers_13)))
		.pause(4)
		.exec(http("RecordedSimulation3_32")
			.get("/piloto/matriz-de-informacion.php")
			.headers(headers_1)
			.resources(http("RecordedSimulation3_33")
			.get("/piloto/pluginAppObj_4_01/jquery-ui.min.css")
			.headers(headers_2),
            http("RecordedSimulation3_34")
			.get("/piloto/pluginAppObj_4_01/jtable.css")
			.headers(headers_2),
            http("RecordedSimulation3_35")
			.get("/piloto/pcss/matriz-de-informacion.css?13-1-8-23-636555116384106024")
			.headers(headers_2),
            http("RecordedSimulation3_36")
			.get("/piloto/appsresources/jquery.jtable.min.js")
			.headers(headers_9),
            http("RecordedSimulation3_37")
			.get("/piloto/pluginAppObj_4_01/dbviewer.php")
			.headers(headers_9),
            http("RecordedSimulation3_38")
			.get("/piloto/appsresources/jquery-ui.min.js")
			.headers(headers_9),
            http("RecordedSimulation3_39")
			.get("/piloto/pluginAppObj_4_01/column-sortable.png")
			.headers(headers_13),
            http("RecordedSimulation3_40")
			.get("/piloto/pluginAppObj_4_01/add.png")
			.headers(headers_13),
            http("RecordedSimulation3_41")
			.post("/piloto/pluginAppObj_4_01/dbviewer.php?action=list&jtStartIndex=0&jtPageSize=10")
			.headers(headers_41),
            http("RecordedSimulation3_42")
			.get("/piloto/pluginAppObj_4_01/delete.png")
			.headers(headers_13),
            http("RecordedSimulation3_43")
			.get("/piloto/pluginAppObj_4_01/edit.png")
			.headers(headers_13)))
		.pause(11)
		.exec(http("RecordedSimulation3_44")
			.post("/piloto/pluginAppObj_4_01/dbviewer.php?action=list&jtStartIndex=0&jtPageSize=10")
			.headers(headers_44)
			.formParam("filter", "niciolas"))
		.pause(3)
		.exec(http("RecordedSimulation3_45")
			.get("/piloto/res/imlogout.php")
			.headers(headers_1))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}