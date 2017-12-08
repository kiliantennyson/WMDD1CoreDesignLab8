
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Customer: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Customer")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Customer Catalogue</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <h1>WeGiveOurCustomersDetails.com </h1>

  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Address</th>
  
  <th>Phone</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Cust. row(s) -->
  """),_display_(/*32.4*/for(c <-Customer) yield /*32.21*/{_display_(Seq[Any](format.raw/*32.22*/("""
  """),format.raw/*33.3*/("""<tr>
  
      <td>"""),_display_(/*35.12*/c/*35.13*/.getId),format.raw/*35.19*/("""</td>
      <td>"""),_display_(/*36.12*/c/*36.13*/.getName),format.raw/*36.21*/("""</td>
      <td>"""),_display_(/*37.12*/c/*37.13*/.getAddress),format.raw/*37.24*/("""</td>
      <td>"""),_display_(/*38.12*/c/*38.13*/.getPhone),format.raw/*38.22*/("""</td>
      <td>
        <a href=""""),_display_(/*40.19*/routes/*40.25*/.HomeController.deleteCustomer(c.getId)),format.raw/*40.64*/("""" class="button-xs btn danger" onclick="return confirmDel();">
          <img class="icon" src=""""),_display_(/*41.35*/routes/*41.41*/.Assets.versioned("images/bin.png")),format.raw/*41.76*/("""" alt="trashIcon">          
        </a>
      </td>
  </tr>

  """)))}),format.raw/*46.4*/("""
  
  """),format.raw/*48.3*/("""</tbody>
  
  </table>

  <a href=""""),_display_(/*52.13*/routes/*52.19*/.HomeController.addCustomer()),format.raw/*52.48*/("""">
      <button type="button" class="btn btn-primary">Add a Customer</button>
  </a>
  
<br>
<br>
  """)))}))
      }
    }
  }

  def render(Customer:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(Customer)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (Customer) => apply(Customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 12:41:33 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab /play-java-seed/app/views/customer.scala.html
                  HASH: d23ea0480ccdeaa8f8529a7ebe83ce86d3411cb8
                  MATRIX: 966->1|1094->34|1122->37|1146->53|1185->55|1217->61|1592->410|1625->427|1664->428|1694->431|1740->450|1750->451|1777->457|1821->474|1831->475|1860->483|1904->500|1914->501|1946->512|1990->529|2000->530|2030->539|2092->574|2107->580|2167->619|2291->716|2306->722|2362->757|2458->823|2491->829|2554->865|2569->871|2619->900
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|64->32|64->32|64->32|65->33|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|72->40|73->41|73->41|73->41|78->46|80->48|84->52|84->52|84->52
                  -- GENERATED --
              */
          