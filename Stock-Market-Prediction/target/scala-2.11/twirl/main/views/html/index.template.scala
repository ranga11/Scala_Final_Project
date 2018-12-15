
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
import play.api.mvc._
import play.api.data._
/*1.2*/import helper._
/*3.2*/import views.html.b4.inline.fieldConstructor

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Tuple2[String, String]],Form[UserFormData],String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userForm: Form[Tuple2[String,String]])(createUserForm : Form[UserFormData])(msg:String)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};implicit def /*7.2*/implicitFieldConstructor1/*7.27*/ = {{ b4.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*6.80*/("""
"""),format.raw/*7.90*/("""

"""),_display_(/*9.2*/main("Stock Market Analysis")/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""
"""),format.raw/*10.1*/("""<p>"""),_display_(/*10.5*/msg),format.raw/*10.8*/("""</p>
<h3>The Better we know you, the more we can do !</h3>
"""),_display_(/*12.2*/form(action=routes.HomeController.userLogin(),'class -> "form-horizontal" )/*12.77*/ {_display_(Seq[Any](format.raw/*12.79*/("""
"""),_display_(/*13.2*/b4/*13.4*/.email(userForm("email"),'_label -> "Email", 'id -> "Email")),format.raw/*13.64*/("""
"""),_display_(/*14.2*/b4/*14.4*/.password(userForm("password"),'_label -> "Password", 'id -> "Password")),format.raw/*14.76*/("""
"""),format.raw/*15.1*/("""<div class="control-group">
    <div class="controls">
        <input id="submit" type="submit" value="Login" class="btn btn-primary">
    </div>
</div>
<br/>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">click here to sign
    up
</button>
""")))}),format.raw/*24.2*/("""

"""),format.raw/*26.1*/("""<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            """),_display_(/*29.14*/form(action=routes.HomeController.createUser,'class -> "form-horizontal" )/*29.88*/ {_display_(Seq[Any](format.raw/*29.90*/("""
            """),_display_(/*30.14*/b4/*30.16*/.text(createUserForm("name"), '_label -> "Name", '_help -> "A Name between 1 and 20 characters")),format.raw/*30.112*/("""
            """),_display_(/*31.14*/b4/*31.16*/.number(createUserForm("age"), '_label -> "Age", '_help -> "From 18 to 99 years old")),format.raw/*31.101*/("""
            """),_display_(/*32.14*/b4/*32.16*/.email(createUserForm("email"), '_label -> "Email")),format.raw/*32.67*/("""
            """),_display_(/*33.14*/b4/*33.16*/.password(createUserForm("password"), '_label -> "Password")),format.raw/*33.76*/("""
            """),format.raw/*34.13*/("""<div class="control-group">
                <div class="controls">
                    <input id="submit" type="submit" value="Sign Up" class="btn btn-primary">
                </div>
            </div>
            """)))}),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""</div>
    </div>

</div>


""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[Tuple2[String, String]],createUserForm:Form[UserFormData],msg:String,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(createUserForm)(msg)(messages)

  def f:((Form[Tuple2[String, String]]) => (Form[UserFormData]) => (String) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (createUserForm) => (msg) => (messages) => apply(userForm)(createUserForm)(msg)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 15 00:40:49 EST 2018
                  SOURCE: /Users/vinyaskaushiktr/Downloads/scalaproject/Scala_Final_Project/Stock-Market-Prediction/app/views/index.scala.html
                  HASH: a1f0c6c701821edcd7a31ed939c6d04f3c66caef
                  MATRIX: 432->1|455->19|875->66|1093->199|1125->223|1201->279|1234->304|1327->277|1355->367|1383->370|1420->399|1459->401|1487->402|1517->406|1540->409|1626->469|1710->544|1750->546|1778->548|1788->550|1869->610|1897->612|1907->614|2000->686|2028->687|2355->984|2384->986|2625->1200|2708->1274|2748->1276|2789->1290|2800->1292|2918->1388|2959->1402|2970->1404|3077->1489|3118->1503|3129->1505|3201->1556|3242->1570|3253->1572|3334->1632|3375->1645|3622->1861|3658->1870|3717->1899
                  LINES: 17->1|18->3|23->5|27->6|27->6|27->7|27->7|28->6|29->7|31->9|31->9|31->9|32->10|32->10|32->10|34->12|34->12|34->12|35->13|35->13|35->13|36->14|36->14|36->14|37->15|46->24|48->26|51->29|51->29|51->29|52->30|52->30|52->30|53->31|53->31|53->31|54->32|54->32|54->32|55->33|55->33|55->33|56->34|61->39|62->40|68->46
                  -- GENERATED --
              */
          