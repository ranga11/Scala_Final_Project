
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>"""),_display_(/*19.13*/title),format.raw/*19.18*/("""</title>


    <link href="assets/stylesheets/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="assets/stylesheets/stylish-portfolio.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="assets/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"
          rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <center>
    <div class="text-vertical-center">

        <font color="Black"><h1>Money Tweets Money</h1>
            <h2>Where your Future Shines</h2>
            <h3> Buy on Rumour ! The Trend is your Friend ! And sell on Greed $$</h3>
            <br>
        </font>
    </div>
    </center>
</head >

<body>
<a id="menu-toggle" href="#" class="btn btn-dark btn-lg toggle"><i class="fa fa-bars"></i></a>
<nav id="sidebar-wrapper">
    <ul class="sidebar-nav">
        <a id="menu-close" href="#" class="btn btn-light btn-lg pull-right toggle"><i class="fa fa-times"></i></a>
        <li class="sidebar-brand">
            <a href="#top" onclick=$("#menu-close").click();>Start Bootstrap</a>
        </li>
        <li>
            <a href="#top" onclick=$("#menu-close").click();>Home</a>
        </li>
        <li>
            <a href="#about" onclick=$("#menu-close").click();>About</a>
        </li>
        <li>
            <a href="#services" onclick=$("#menu-close").click();>Services</a>
        </li>
        <li>
            <a href="#portfolio" onclick=$("#menu-close").click();>Portfolio</a>
        </li>
        <li>
            <a href="#contact" onclick=$("#menu-close").click();>Contact</a>
        </li>
    </ul>
</nav>

<!-- Header -->
<header id="top" class="header">
    <div class="text-vertical-center">
        <!--<font color="Black"><h1>Money Tweets Money</h1>
        <h2>Where your Future Shines</h2>
        <h3> Buy on Rumour ! The Trend is your Friend ! And sell on GreedSS</h3>
            <br>
        </font>
        -->
        <a href="#about" class="btn btn-dark btn-lg">Find Out More</a>
    </div>
</header>
<section id="about" class="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                """),_display_(/*92.18*/content),format.raw/*92.25*/("""
            """),format.raw/*93.13*/("""</div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->
</section>

<!-- Footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-lg-10 col-lg-offset-1 text-center">
                <h4><strong>Stock Exchange 2018</strong>
                </h4>
                <p>Northeastern University
                    <br>360 Hunington Avenue, MA 02120</p>
                <ul class="list-unstyled">
                    <li><i class="fa fa-phone fa-fw"></i> (123) 456-7890</li>
                    <li><i class="fa fa-envelope-o fa-fw"></i> <a href="mailto:nameexample.com">nameexample.com</a>
                    </li>
                </ul>
                <br>
                <ul class="list-inline">
                    <li>
                        <a href="#"><i class="fa fa-facebook fa-fw fa-3x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-twitter fa-fw fa-3x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-dribbble fa-fw fa-3x"></i></a>
                    </li>
                </ul>
                <hr class="small">
              <!--  <p class="text-muted">Copyright &copy; NEU Stock Exchange 2014</p> -->
            </div>
        </div>
    </div>
    <a id="to-top" href="#top" class="btn btn-dark btn-lg"><i class="fa fa-chevron-up fa-fw fa-1x"></i></a>
</footer>

<!-- jQuery -->
<script src="assets/javascripts/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="assets/javascripts/bootstrap.min.js"></script>

<!-- Custom Theme JavaScript -->
<script>
            // Closes the sidebar menu
            $("#menu-close").click(function(e) """),format.raw/*143.48*/("""{"""),format.raw/*143.49*/("""
                """),format.raw/*144.17*/("""e.preventDefault();
                $("#sidebar-wrapper").toggleClass("active");
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/(""");
            // Opens the sidebar menu
            $("#menu-toggle").click(function(e) """),format.raw/*148.49*/("""{"""),format.raw/*148.50*/("""
                """),format.raw/*149.17*/("""e.preventDefault();
                $("#sidebar-wrapper").toggleClass("active");
            """),format.raw/*151.13*/("""}"""),format.raw/*151.14*/(""");
            // Scrolls to the selected menu item on the page
            $(function() """),format.raw/*153.26*/("""{"""),format.raw/*153.27*/("""
                """),format.raw/*154.17*/("""$('a[href*=#]:not([href=#],[data-toggle],[data-target],[data-slide])').click(function() """),format.raw/*154.105*/("""{"""),format.raw/*154.106*/("""
                    """),format.raw/*155.21*/("""if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) """),format.raw/*155.137*/("""{"""),format.raw/*155.138*/("""
                        """),format.raw/*156.25*/("""var target = $(this.hash);
                        target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                        if (target.length) """),format.raw/*158.44*/("""{"""),format.raw/*158.45*/("""
                            """),format.raw/*159.29*/("""$('html,body').animate("""),format.raw/*159.52*/("""{"""),format.raw/*159.53*/("""
                                """),format.raw/*160.33*/("""scrollTop: target.offset().top
                            """),format.raw/*161.29*/("""}"""),format.raw/*161.30*/(""", 1000);
                            return false;
                        """),format.raw/*163.25*/("""}"""),format.raw/*163.26*/("""
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/("""
                """),format.raw/*165.17*/("""}"""),format.raw/*165.18*/(""");
            """),format.raw/*166.13*/("""}"""),format.raw/*166.14*/(""");
            //#to-top button appears after scrolling
            var fixed = false;
            $(document).scroll(function() """),format.raw/*169.43*/("""{"""),format.raw/*169.44*/("""
                """),format.raw/*170.17*/("""if ($(this).scrollTop() > 250) """),format.raw/*170.48*/("""{"""),format.raw/*170.49*/("""
                    """),format.raw/*171.21*/("""if (!fixed) """),format.raw/*171.33*/("""{"""),format.raw/*171.34*/("""
                        """),format.raw/*172.25*/("""fixed = true;
                        // $('#to-top').css("""),format.raw/*173.45*/("""{"""),format.raw/*173.46*/("""position:'fixed', display:'block'"""),format.raw/*173.79*/("""}"""),format.raw/*173.80*/(""");
                        $('#to-top').show("slow", function() """),format.raw/*174.62*/("""{"""),format.raw/*174.63*/("""
                            """),format.raw/*175.29*/("""$('#to-top').css("""),format.raw/*175.46*/("""{"""),format.raw/*175.47*/("""
                                """),format.raw/*176.33*/("""position: 'fixed',
                                display: 'block'
                            """),format.raw/*178.29*/("""}"""),format.raw/*178.30*/(""");
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/(""");
                    """),format.raw/*180.21*/("""}"""),format.raw/*180.22*/("""
                """),format.raw/*181.17*/("""}"""),format.raw/*181.18*/(""" """),format.raw/*181.19*/("""else """),format.raw/*181.24*/("""{"""),format.raw/*181.25*/("""
                    """),format.raw/*182.21*/("""if (fixed) """),format.raw/*182.32*/("""{"""),format.raw/*182.33*/("""
                        """),format.raw/*183.25*/("""fixed = false;
                        $('#to-top').hide("slow", function() """),format.raw/*184.62*/("""{"""),format.raw/*184.63*/("""
                            """),format.raw/*185.29*/("""$('#to-top').css("""),format.raw/*185.46*/("""{"""),format.raw/*185.47*/("""
                                """),format.raw/*186.33*/("""display: 'none'
                            """),format.raw/*187.29*/("""}"""),format.raw/*187.30*/(""");
                        """),format.raw/*188.25*/("""}"""),format.raw/*188.26*/(""");
                    """),format.raw/*189.21*/("""}"""),format.raw/*189.22*/("""
                """),format.raw/*190.17*/("""}"""),format.raw/*190.18*/("""
            """),format.raw/*191.13*/("""}"""),format.raw/*191.14*/(""");
            // Disable Google Maps scrolling
            // See http://stackoverflow.com/a/25904582/1607849
            // Disable scroll zooming and bind back the click event
            var onMapMouseleaveHandler = function(event) """),format.raw/*195.58*/("""{"""),format.raw/*195.59*/("""
                """),format.raw/*196.17*/("""var that = $(this);
                that.on('click', onMapClickHandler);
                that.off('mouseleave', onMapMouseleaveHandler);
                that.find('iframe').css("pointer-events", "none");
            """),format.raw/*200.13*/("""}"""),format.raw/*200.14*/(""";
            var onMapClickHandler = function(event) """),format.raw/*201.53*/("""{"""),format.raw/*201.54*/("""
                """),format.raw/*202.17*/("""var that = $(this);
                // Disable the click handler until the user leaves the map area
                that.off('click', onMapClickHandler);
                // Enable scrolling zoom
                that.find('iframe').css("pointer-events", "auto");
                // Handle the mouse leave event
                that.on('mouseleave', onMapMouseleaveHandler);
            """),format.raw/*209.13*/("""}"""),format.raw/*209.14*/(""";
            // Enable map zooming with mouse scroll when the user clicks the map
            $('.map').on('click', onMapClickHandler);



</script>
</body>

</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 13 22:31:39 EST 2018
                  SOURCE: C:/Users/Ranga Chari/Desktop/Scala Assignemnets/FINAL_Stock/Stock-Market-Prediction/app/views/main.scala.html
                  HASH: 459b87379711db1f144220801c5edc8e6d7086da
                  MATRIX: 987->261|1112->291|1142->295|1468->594|1494->599|4246->3324|4274->3331|4316->3345|6166->5166|6196->5167|6243->5185|6367->5280|6397->5281|6517->5372|6547->5373|6594->5391|6718->5486|6748->5487|6868->5578|6898->5579|6945->5597|7063->5685|7094->5686|7145->5708|7291->5824|7322->5825|7377->5851|7576->6021|7606->6022|7665->6052|7717->6075|7747->6076|7810->6110|7899->6170|7929->6171|8035->6248|8065->6249|8116->6271|8146->6272|8193->6290|8223->6291|8268->6307|8298->6308|8459->6440|8489->6441|8536->6459|8596->6490|8626->6491|8677->6513|8718->6525|8748->6526|8803->6552|8891->6611|8921->6612|8983->6645|9013->6646|9107->6711|9137->6712|9196->6742|9242->6759|9272->6760|9335->6794|9462->6892|9492->6893|9549->6921|9579->6922|9632->6946|9662->6947|9709->6965|9739->6966|9769->6967|9803->6972|9833->6973|9884->6995|9924->7006|9954->7007|10009->7033|10115->7110|10145->7111|10204->7141|10250->7158|10280->7159|10343->7193|10417->7238|10447->7239|10504->7267|10534->7268|10587->7292|10617->7293|10664->7311|10694->7312|10737->7326|10767->7327|11036->7567|11066->7568|11113->7586|11362->7806|11392->7807|11476->7862|11506->7863|11553->7881|11974->8273|12004->8274
                  LINES: 26->7|31->7|33->9|43->19|43->19|116->92|116->92|117->93|167->143|167->143|168->144|170->146|170->146|172->148|172->148|173->149|175->151|175->151|177->153|177->153|178->154|178->154|178->154|179->155|179->155|179->155|180->156|182->158|182->158|183->159|183->159|183->159|184->160|185->161|185->161|187->163|187->163|188->164|188->164|189->165|189->165|190->166|190->166|193->169|193->169|194->170|194->170|194->170|195->171|195->171|195->171|196->172|197->173|197->173|197->173|197->173|198->174|198->174|199->175|199->175|199->175|200->176|202->178|202->178|203->179|203->179|204->180|204->180|205->181|205->181|205->181|205->181|205->181|206->182|206->182|206->182|207->183|208->184|208->184|209->185|209->185|209->185|210->186|211->187|211->187|212->188|212->188|213->189|213->189|214->190|214->190|215->191|215->191|219->195|219->195|220->196|224->200|224->200|225->201|225->201|226->202|233->209|233->209
                  -- GENERATED --
              */
          