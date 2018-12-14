
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

object recomendation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<meta charset="utf-8">
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
  <!--<link href="/assets/stylesheets/heroic-features.css" rel="stylesheet">-->

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>

  <![endif]-->
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.min.js"></script>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

</head>
<style> /* set the CSS */

body """),format.raw/*32.6*/("""{"""),format.raw/*32.7*/(""" """),format.raw/*32.8*/("""font: 12px Arial;"""),format.raw/*32.25*/("""}"""),format.raw/*32.26*/("""

"""),format.raw/*34.1*/("""path """),format.raw/*34.6*/("""{"""),format.raw/*34.7*/("""
  """),format.raw/*35.3*/("""stroke: steelblue;
  stroke-width: 2;
  fill: none;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/(""".axis path,
.axis line """),format.raw/*41.12*/("""{"""),format.raw/*41.13*/("""
  """),format.raw/*42.3*/("""fill: none;
  stroke: grey;
  stroke-width: 1;
  shape-rendering: crispEdges;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""

"""),format.raw/*48.1*/("""div.tooltip """),format.raw/*48.13*/("""{"""),format.raw/*48.14*/("""
  """),format.raw/*49.3*/("""position: absolute;
  text-align: center;
  width: 60px;
  height: 28px;
  padding: 2px;
  font: 12px sans-serif;
  background: lightsteelblue;
  border: 0px;
  border-radius: 8px;
  /*  pointer-events: none;    This line needs to be removed */

"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""

"""),format.raw/*62.1*/("""</style>
<body>
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
  </div><!-- /#sidebar-wrapper -->


  <!-- Page Content -->
  <div id="page-content-wrapper">
    <div class="container-fluid">
      <div class="row" id="graphs">
        <div class="col-lg-12">
          <div id="recommendation" >
            <h1>Where Pennies become $Dollar's$ !!</h1>
            <div class="form-group">
              <label for="parm1">Company Names </label>
              <select class="form-control" id="parm1">
                <option>Apple</option>
                <option>Amazon</option>
                <!-- <option>Expedia</option> -->
                <!-- <option>TripAdvisor</option> -->
                <option>Google</option>
                <!-- <option>Ebay</option> -->
                <option>FaceBook</option>
                <option>MicroSoft</option>
                <!-- <option>Walmart</option> -->
              </select>



              <br>
              <button type="button" id="fetchRecommendation" class="btn btn-primary" onclick="Prediction()">
                Recommend Listings
              </button>

              <div id="a">
              </div>

            </div>
          </div>

        </div>
      </div>
      <!-- /#page-content-wrapper -->

    </div>
  </div>
</div>

</body>

<!-- load the d3.js library -->
<script type=
                "text/javascript" src="http://d3js.org/d3.v3.min.js">
</script>


<script src="/assets/javascripts/jquery.js"></script>
<script src="/assets/javascripts/recommendation.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="/assets/javascripts/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
                $(document).ready(function() """),format.raw/*150.46*/("""{"""),format.raw/*150.47*/("""
                  """),format.raw/*151.19*/("""$("#wrapper").toggleClass("toggled");
                """),format.raw/*152.17*/("""}"""),format.raw/*152.18*/(""");

        </script>



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
                  DATE: Thu Dec 13 20:08:56 EST 2018
                  SOURCE: C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/app/views/recomendation.scala.html
                  HASH: 6363a9fb99a8e4d228d1ac6e0ab8cd4565eaa617
                  MATRIX: 819->0|1963->1117|1991->1118|2019->1119|2064->1136|2093->1137|2124->1141|2156->1146|2184->1147|2215->1151|2297->1206|2325->1207|2356->1211|2408->1235|2437->1236|2468->1240|2577->1322|2605->1323|2636->1327|2676->1339|2705->1340|2736->1344|3020->1601|3048->1602|3079->1606|5521->4019|5551->4020|5600->4040|5684->4095|5714->4096
                  LINES: 26->1|57->32|57->32|57->32|57->32|57->32|59->34|59->34|59->34|60->35|63->38|63->38|65->40|66->41|66->41|67->42|71->46|71->46|73->48|73->48|73->48|74->49|85->60|85->60|87->62|175->150|175->150|176->151|177->152|177->152
                  -- GENERATED --
              */
          