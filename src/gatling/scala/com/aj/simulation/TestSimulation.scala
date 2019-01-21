package com.aj.simulation

import com.aj.shared.SharedResources
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class TestSimulation extends Simulation {

  val getBin = scenario("Get Http Bin")
    .exec(http("Get Http Bin")
      .get("/get")
      .header("Content-Type", "application/json")
      .header("Accept-Encoding", "gzip")
      .body(StringBody("{}"))
      .check(status.is(200)))

  setUp(getBin.inject(rampUsers(20) over(10 seconds))).protocols(SharedResources.httpConf)

}
