package com.aj.shared

import io.gatling.core.Predef._
import io.gatling.http.Predef.http

object SharedResources {

  val httpConf = http
    .baseURL("http://httpbin.org")
    .acceptHeader("application/json,text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

}
