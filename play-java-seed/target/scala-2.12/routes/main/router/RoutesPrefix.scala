
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/conf/routes
// @DATE:Mon Dec 11 20:05:45 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
