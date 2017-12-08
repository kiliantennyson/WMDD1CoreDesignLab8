
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Add Customer")/*6.22*/{_display_(Seq[Any](format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Customer</p>



"""),_display_(/*11.2*/if(flash.containsKey("success"))/*11.34*/{_display_(Seq[Any](format.raw/*11.35*/("""
    """),format.raw/*12.5*/("""<div class="alert alert-sucess">
        """),_display_(/*13.10*/flash/*13.15*/.get("success")),format.raw/*13.30*/("""
        """),format.raw/*14.9*/("""</div>
""")))}),format.raw/*15.2*/("""

"""),_display_(/*17.2*/form(action=routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role-> "form")/*17.101*/{_display_(Seq[Any](format.raw/*17.102*/("""
"""),_display_(/*18.2*/CSRF/*18.6*/.formField),format.raw/*18.16*/("""

"""),_display_(/*20.2*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*20.78*/("""
"""),_display_(/*21.2*/inputText(customerForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*21.84*/("""
"""),_display_(/*22.2*/inputText(customerForm("phone"), '_label -> "Phone", 'class -> "form-control")),format.raw/*22.80*/("""

"""),_display_(/*24.2*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.67*/("""

"""),format.raw/*26.1*/("""<div class="actions">
    <input type="submit" value="Add/Update Customer" class-"btn btn-primary"> 
    <a href=""""),_display_(/*28.15*/routes/*28.21*/.HomeController.index),format.raw/*28.42*/("""">
        <button type="button" class="btn btn-warning">Cancel</button>
    </a>
</div>
""")))}),format.raw/*32.2*/("""
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 09:16:19 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab /play-java-seed/app/views/addCustomer.scala.html
                  HASH: 50abe0f27c7e04b9f8adc2bb7c23faf25ee11838
                  MATRIX: 969->1|1079->41|1124->38|1152->57|1180->60|1208->80|1246->81|1277->86|1346->129|1387->161|1426->162|1458->167|1527->209|1541->214|1577->229|1613->238|1651->246|1680->249|1789->348|1829->349|1857->351|1869->355|1900->365|1929->368|2026->444|2054->446|2157->528|2185->530|2284->608|2313->611|2399->676|2428->678|2570->793|2585->799|2627->820|2747->910|2779->912
                  LINES: 28->1|31->3|34->1|36->4|38->6|38->6|38->6|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|49->17|49->17|50->18|50->18|50->18|52->20|52->20|53->21|53->21|54->22|54->22|56->24|56->24|58->26|60->28|60->28|60->28|64->32|65->33
                  -- GENERATED --
              */
          