package com.qanova2

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation1 extends Simulation {

	object Configuration {

		val t_concurrency = Integer.getInteger("users", 5).toInt
		val t_rampUp = Integer.getInteger("rampup", 1).toInt
		val t_holdFor = Integer.getInteger("duration", 60).toInt
		val t_throughput = Integer.getInteger("throughput", 100).toInt

	}

	val httpProtocol = http
		.baseUrl("http://www.qanovagroup.com")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("es-ES,es;q=0.9,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_0 = Map(
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Proxy-Connection" -> "keep-alive")

	val headers_3 = Map(
		"Origin" -> "http://www.qanovagroup.com",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val scn = scenario("RecordedSimulation1")
		.exec(http("request_0")
			.get("/piloto/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/piloto/style/style.css?13-1-8-23")
			.headers(headers_1),
            http("request_2")
			.get("/piloto/imHeader_pluginAppObj_02/custom.css")
			.headers(headers_1)))
		.pause(32)
		.exec(http("request_3")
			.post("/piloto/imlogin.php")
			.headers(headers_3)
			.formParam("imUname", "nvivas")
			.formParam("imPwd", "qanova"))
		.pause(1)
		.exec(http("request_4")
			.get("/piloto/carga-de-informacion.php")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_5")
			.get("/piloto/res/imlogout.php")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}