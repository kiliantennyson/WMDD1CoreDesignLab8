
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
  
    """),format.raw/*6.5*/("""<div class="col-xs-4">
        <h3> Sign in </h3>

        """),_display_(/*9.10*/if(loginForm.hasGlobalErrors)/*9.39*/{_display_(Seq[Any](format.raw/*9.40*/("""
            """),format.raw/*10.13*/("""<p class="alert alert-warning">
              """),_display_(/*11.16*/loginForm/*11.25*/.globalError.message),format.raw/*11.45*/("""
            """),format.raw/*12.13*/("""</p>
        """)))}),format.raw/*13.10*/("""

        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/{_display_(Seq[Any](format.raw/*15.41*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
              """),_display_(/*17.16*/flash/*17.21*/.get("loginRequired")),format.raw/*17.42*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""

        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.80*/{_display_(Seq[Any](format.raw/*21.81*/("""
            """),_display_(/*22.14*/CSRF/*22.18*/.formField),format.raw/*22.28*/("""

            """),format.raw/*24.13*/("""<div class="form-group">
                """),_display_(/*25.18*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*25.122*/("""
            """),format.raw/*26.13*/("""</div>

            <div class="form-group">
                """),_display_(/*29.18*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*29.132*/("""
            """),format.raw/*30.13*/("""</div>

            <div class="form-group">
                <input type="submit" value="Sign in" class="btn btn-primary">
            </div>


        """)))}),format.raw/*37.10*/("""

        """),format.raw/*39.9*/("""</div>
    """)))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 23:05:36 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/login.scala.html
                  HASH: 40c5fd6a4e4a29c651986ac4fc550125ffd6b6b4
                  MATRIX: 984->1|1119->65|1164->63|1191->81|1218->83|1245->102|1283->103|1317->111|1403->171|1440->200|1478->201|1519->214|1593->261|1611->270|1652->290|1693->303|1738->317|1776->328|1815->358|1854->359|1895->372|1969->419|1983->424|2025->445|2066->458|2111->472|2149->483|2164->489|2237->553|2276->554|2317->568|2330->572|2361->582|2403->596|2472->638|2598->742|2639->755|2728->817|2864->931|2905->944|3089->1097|3126->1107
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|53->21|53->21|53->21|54->22|54->22|54->22|56->24|57->25|57->25|58->26|61->29|61->29|62->30|69->37|71->39
                  -- GENERATED --
              */
          