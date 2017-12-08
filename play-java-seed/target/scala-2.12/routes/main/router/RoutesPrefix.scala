
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WMDD1CoreDesignLab /play-java-seed/conf/routes
// @DATE:Fri Dec 08 12:41:33 GMT 2017


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
