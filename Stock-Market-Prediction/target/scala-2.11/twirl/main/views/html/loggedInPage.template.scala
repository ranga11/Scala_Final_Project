
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

object loggedInPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="loggedInPage">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title></title>

    <!-- Bootstrap Core CSS -->
    <link href="/assets/stylesheets/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/assets/stylesheets/simple-sidebar.css" rel="stylesheet">
    <link href="/assets/stylesheets/heroic-features.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>

    <![endif]-->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.min.js"></script>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>


</head>

<style type="text/css">

    svg """),format.raw/*35.9*/("""{"""),format.raw/*35.10*/("""
    """),format.raw/*36.5*/("""font-family: "Helvetica Neue", Helvetica;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""

     """),format.raw/*39.6*/(""".line """),format.raw/*39.12*/("""{"""),format.raw/*39.13*/("""
    """),format.raw/*40.5*/("""fill: none;
    stroke: #000;
    stroke-width: 2px;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

"""),format.raw/*45.1*/("""</style>
<body>

<script src="//d3js.org/d3.v3.min.js"></script>
<div id="wrapper">

    <!-- Sidebar -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <li class="sidebar-brand">
                <a href="#">
                    Stock Analysis
                </a>
            </li>
            <li>
                <a href="#" id="showDashboard">Dashboard Analysis</a>
            </li>
            <li>
                <a href="recomendation" id="showRecommendation">Company Listing</a>
            </li>
            <li>
                <a href="differences" id="showDifference">Past V/S Future</a>
            </li>
            <li>
                <a href="twitter" id="">Twitter Analysis</a>
            </li>
            <li>
                <a href="profit" id="">Profit Analysis</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row" id="graphs">
                <div class="col-lg-12">
                    <div id="graphs" ng-controller="controller1">
                        <h1>Stock Exchange Influenced By Twitter Feeds</h1>
                        <p>Smart Investment</p>
                        <br><br>
                        <div id="all" >
                        </div>  <!-- Chart 1-->
                        <!-- Chart 1-->

                    </div>
                </div>
            </div>

        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="/assets/javascripts/jquery.js"></script>
<script src="/assets/javascripts/loggedin.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="/assets/javascripts/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
               $(document).ready(function() """),format.raw/*110.45*/("""{"""),format.raw/*110.46*/("""
                    """),format.raw/*111.21*/("""$("#wrapper").toggleClass("toggled");
                """),format.raw/*112.17*/("""}"""),format.raw/*112.18*/(""");

        </script>


</body>

</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 14 15:39:08 EST 2018
                  SOURCE: C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/app/views/loggedInPage.scala.html
                  HASH: a590266ee69695f49d2fc1a1f54ea1c7e20f8577
                  MATRIX: 818->0|2014->1169|2043->1170|2076->1176|2154->1227|2183->1228|2219->1237|2253->1243|2282->1244|2315->1250|2398->1306|2426->1307|2457->1311|4445->3270|4475->3271|4526->3293|4610->3348|4640->3349
                  LINES: 26->1|60->35|60->35|61->36|62->37|62->37|64->39|64->39|64->39|65->40|68->43|68->43|70->45|135->110|135->110|136->111|137->112|137->112
                  -- GENERATED --
              */
          