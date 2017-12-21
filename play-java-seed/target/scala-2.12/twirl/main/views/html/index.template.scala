
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),_display_(/*3.2*/main("Products Page", user)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
      <div class=col-sm-2>
            <a href=""""),_display_(/*8.23*/routes/*8.29*/.HomeController.index(0)),format.raw/*8.53*/("""" class="list-group-item"> Categories </a>
              
                """),_display_(/*10.18*/for(c <- categories) yield /*10.38*/{_display_(Seq[Any](format.raw/*10.39*/("""
                  """),format.raw/*11.19*/("""<a href=""""),_display_(/*11.29*/routes/*11.35*/.HomeController.index(c.getId)),format.raw/*11.65*/("""" class="list-group-item"> """),_display_(/*11.93*/c/*11.94*/.getName),format.raw/*11.102*/("""
                      """),format.raw/*12.23*/("""<span class="badge"> """),_display_(/*12.45*/c/*12.46*/.getProducts.size()),format.raw/*12.65*/(""" """),format.raw/*12.66*/("""</span>
            </a>
                """)))}),format.raw/*14.18*/("""
      """),format.raw/*15.7*/("""</div>
    <div class="col-sm-10">
                

  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Names</th>

  <th>Category</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>

  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*47.4*/for(p <-products) yield /*47.21*/{_display_(Seq[Any](format.raw/*47.22*/("""
  """),format.raw/*48.3*/("""<tr>
      <td>"""),_display_(/*49.12*/p/*49.13*/.getId),format.raw/*49.19*/("""</td>
      <td>"""),_display_(/*50.12*/p/*50.13*/.getName),format.raw/*50.21*/("""</td>
      <td>"""),_display_(/*51.12*/p/*51.13*/.getCategory.getName),format.raw/*51.33*/("""</td>
      <td>"""),_display_(/*52.12*/p/*52.13*/.getDescription),format.raw/*52.28*/("""</td>
      <td>"""),_display_(/*53.12*/p/*53.13*/.getStock),format.raw/*53.22*/("""</td>

   
      <td id="priceColumn">&euro; """),_display_(/*56.36*/("%.2f".format(p.getPrice))),format.raw/*56.63*/("""</td>
      """),_display_(/*57.8*/if(user != null)/*57.24*/{_display_(Seq[Any](format.raw/*57.25*/("""
        """),_display_(/*58.10*/if(user.getRole=="admin")/*58.35*/{_display_(Seq[Any](format.raw/*58.36*/("""
            
     
      """),format.raw/*61.7*/("""<td>
        <a href=""""),_display_(/*62.19*/routes/*62.25*/.HomeController.updateProduct(p.getId)),format.raw/*62.63*/("""" class="button-xs btn danger">
          <img class="icon" src=""""),_display_(/*63.35*/routes/*63.41*/.Assets.versioned("images/edit.png")),format.raw/*63.77*/("""" alt="editIcon">          
        </a>
      </td>
      
      <td>
        <a href=""""),_display_(/*68.19*/routes/*68.25*/.HomeController.deleteProduct(p.getId)),format.raw/*68.63*/("""" class="button-xs btn danger" onclick="return confirmDel();">
          <img class="icon" src=""""),_display_(/*69.35*/routes/*69.41*/.Assets.versioned("images/bin.png")),format.raw/*69.76*/("""" alt="trashIcon">          
        </a>
      </td>
    </tr>


    """)))}),format.raw/*75.6*/("""
    """)))}),format.raw/*76.6*/("""

  """)))}),format.raw/*78.4*/("""
  
  """),format.raw/*80.3*/("""</tbody>
  
  </table>

  """),_display_(/*84.4*/if(user != null)/*84.20*/{_display_(Seq[Any](format.raw/*84.21*/("""
    """),_display_(/*85.6*/if(user.getRole=="admin")/*85.31*/{_display_(Seq[Any](format.raw/*85.32*/("""
  """),format.raw/*86.3*/("""<a href=""""),_display_(/*86.13*/routes/*86.19*/.HomeController.addProduct()),format.raw/*86.47*/("""">
  <button type="button" class="btn btn-primary">Add a product</button>
  </a>
  """)))}),format.raw/*89.4*/("""
  """)))}),format.raw/*90.4*/("""

"""),format.raw/*92.1*/("""</div>
</div>


<br>
<br>
  """)))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 21 23:32:24 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1CoreDesignLab  (copy 1)/play-java-seed/app/views/index.scala.html
                  HASH: 473985b16850b86012f12951f23f91e482d3275c
                  MATRIX: 1002->1|1189->93|1217->96|1252->123|1291->125|1323->131|1456->238|1470->244|1514->268|1616->343|1652->363|1691->364|1738->383|1775->393|1790->399|1841->429|1896->457|1906->458|1936->466|1987->489|2036->511|2046->512|2086->531|2115->532|2188->574|2222->581|2614->947|2647->964|2686->965|2716->968|2759->984|2769->985|2796->991|2840->1008|2850->1009|2879->1017|2923->1034|2933->1035|2974->1055|3018->1072|3028->1073|3064->1088|3108->1105|3118->1106|3148->1115|3221->1161|3269->1188|3308->1201|3333->1217|3372->1218|3409->1228|3443->1253|3482->1254|3535->1280|3585->1303|3600->1309|3659->1347|3752->1413|3767->1419|3824->1455|3940->1544|3955->1550|4014->1588|4138->1685|4153->1691|4209->1726|4310->1797|4346->1803|4381->1808|4414->1814|4467->1841|4492->1857|4531->1858|4563->1864|4597->1889|4636->1890|4666->1893|4703->1903|4718->1909|4767->1937|4881->2021|4915->2025|4944->2027
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|46->14|47->15|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|93->61|94->62|94->62|94->62|95->63|95->63|95->63|100->68|100->68|100->68|101->69|101->69|101->69|107->75|108->76|110->78|112->80|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|118->86|121->89|122->90|124->92
                  -- GENERATED --
              */
          