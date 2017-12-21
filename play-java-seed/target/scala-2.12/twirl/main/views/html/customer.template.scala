
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Customer: List[models.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/(""")

"""),_display_(/*3.2*/main("Customer", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  
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
        <a href=""""),_display_(/*40.19*/routes/*40.25*/.HomeController.updateCustomer(c.getId)),format.raw/*40.64*/("""" class="button-xs btn danger">
          <img class="icon" src=""""),_display_(/*41.35*/routes/*41.41*/.Assets.versioned("images/edit.png")),format.raw/*41.77*/("""" alt="editIcon">          
        </a>
      </td>
      <td>
        <a href=""""),_display_(/*45.19*/routes/*45.25*/.HomeController.deleteCustomer(c.getId)),format.raw/*45.64*/("""" class="button-xs btn danger" onclick="return confirmDel();">
          <img class="icon" src=""""),_display_(/*46.35*/routes/*46.41*/.Assets.versioned("images/bin.png")),format.raw/*46.76*/("""" alt="trashIcon">          
        </a>
      </td>
  </tr>

  """)))}),format.raw/*51.4*/("""
  
  """),format.raw/*53.3*/("""</tbody>
  
  </table>

  <a href=""""),_display_(/*57.13*/routes/*57.19*/.HomeController.addCustomer()),format.raw/*57.48*/("""">
      <button type="button" class="btn btn-primary">Add a Customer</button>
  </a>
  
<br>
<br>
  """)))}))
      }
    }
  }

  def render(Customer:List[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(Customer,user)

  def f:((List[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (Customer,user) => apply(Customer,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 22:39:20 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/customer.scala.html
                  HASH: e8d3376f4b8bbd9d496d34dfa77ad751ebf83058
                  MATRIX: 984->1|1137->59|1166->63|1196->85|1235->87|1267->93|1642->442|1675->459|1714->460|1744->463|1790->482|1800->483|1827->489|1871->506|1881->507|1910->515|1954->532|1964->533|1996->544|2040->561|2050->562|2080->571|2142->606|2157->612|2217->651|2310->717|2325->723|2382->759|2491->841|2506->847|2566->886|2690->983|2705->989|2761->1024|2857->1090|2890->1096|2953->1132|2968->1138|3018->1167
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|64->32|64->32|64->32|65->33|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|72->40|72->40|72->40|73->41|73->41|73->41|77->45|77->45|77->45|78->46|78->46|78->46|83->51|85->53|89->57|89->57|89->57
                  -- GENERATED --
              */
          