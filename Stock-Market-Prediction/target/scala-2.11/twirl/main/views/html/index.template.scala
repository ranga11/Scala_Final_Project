
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
Seq[Any](format.raw/*5.133*/("""
"""),format.raw/*6.80*/("""
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
                  DATE: Thu Dec 13 22:12:51 EST 2018
                  SOURCE: C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/app/views/index.scala.html
                  HASH: 65adf8a1c6ad050175b7578a266613b6933d05b7
                  MATRIX: 432->1|455->21|875->70|1093->204|1125->228|1201->285|1234->310|1328->201|1357->282|1386->373|1416->378|1453->407|1492->409|1521->411|1551->415|1574->418|1662->480|1746->555|1786->557|1815->560|1825->562|1906->622|1935->625|1945->627|2038->699|2067->701|2403->1007|2434->1011|2678->1228|2761->1302|2801->1304|2843->1319|2854->1321|2972->1417|3014->1432|3025->1434|3132->1519|3174->1534|3185->1536|3257->1587|3299->1602|3310->1604|3391->1664|3433->1678|3685->1899|3722->1909|3787->1944
                  LINES: 17->1|18->3|23->5|27->6|27->6|27->7|27->7|28->5|29->6|30->7|32->9|32->9|32->9|33->10|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|47->24|49->26|52->29|52->29|52->29|53->30|53->30|53->30|54->31|54->31|54->31|55->32|55->32|55->32|56->33|56->33|56->33|57->34|62->39|63->40|69->46
                  -- GENERATED --
              */
          