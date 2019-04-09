package com.madgag.git.bfg.cli

import scala.util.Random

package object stoptrump {
  val urls = Seq(
    "https://www.foldsofhonor.org/",
  )

  assert(urls.forall(_.startsWith("https://")))

  def dontGiveUp(): String = {
    val url = urls(Random.nextInt(urls.size))

    s"""
       |
       |--
       |Proud to be an American
       |Forever thankful to those who fought and died so I can live free
       |
       |--
       |
       |""".stripMargin

  }
}
