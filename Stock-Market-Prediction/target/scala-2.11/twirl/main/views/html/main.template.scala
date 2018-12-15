
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


Seq[Any](format.raw/*8.1*/("""
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
                  DATE: Sat Dec 15 00:40:49 EST 2018
                  SOURCE: /Users/vinyaskaushiktr/Downloads/scalaproject/Scala_Final_Project/Stock-Market-Prediction/app/views/main.scala.html
                  HASH: 42b69c0e97957c44f7427f95bda7af74040bebbb
                  MATRIX: 982->255|1106->286|1133->287|1449->576|1475->581|4154->3233|4182->3240|4223->3253|6023->5024|6053->5025|6099->5042|6221->5135|6251->5136|6369->5225|6399->5226|6445->5243|6567->5336|6597->5337|6715->5426|6745->5427|6791->5444|6909->5532|6940->5533|6990->5554|7136->5670|7167->5671|7221->5696|7418->5864|7448->5865|7506->5894|7558->5917|7588->5918|7650->5951|7738->6010|7768->6011|7872->6086|7902->6087|7952->6108|7982->6109|8028->6126|8058->6127|8102->6142|8132->6143|8290->6272|8320->6273|8366->6290|8426->6321|8456->6322|8506->6343|8547->6355|8577->6356|8631->6381|8718->6439|8748->6440|8810->6473|8840->6474|8933->6538|8963->6539|9021->6568|9067->6585|9097->6586|9159->6619|9284->6715|9314->6716|9370->6743|9400->6744|9452->6767|9482->6768|9528->6785|9558->6786|9588->6787|9622->6792|9652->6793|9702->6814|9742->6825|9772->6826|9826->6851|9931->6927|9961->6928|10019->6957|10065->6974|10095->6975|10157->7008|10230->7052|10260->7053|10316->7080|10346->7081|10398->7104|10428->7105|10474->7122|10504->7123|10546->7136|10576->7137|10841->7373|10871->7374|10917->7391|11162->7607|11192->7608|11275->7662|11305->7663|11351->7680|11765->8065|11795->8066
                  LINES: 26->7|31->8|32->9|42->19|42->19|115->92|115->92|116->93|166->143|166->143|167->144|169->146|169->146|171->148|171->148|172->149|174->151|174->151|176->153|176->153|177->154|177->154|177->154|178->155|178->155|178->155|179->156|181->158|181->158|182->159|182->159|182->159|183->160|184->161|184->161|186->163|186->163|187->164|187->164|188->165|188->165|189->166|189->166|192->169|192->169|193->170|193->170|193->170|194->171|194->171|194->171|195->172|196->173|196->173|196->173|196->173|197->174|197->174|198->175|198->175|198->175|199->176|201->178|201->178|202->179|202->179|203->180|203->180|204->181|204->181|204->181|204->181|204->181|205->182|205->182|205->182|206->183|207->184|207->184|208->185|208->185|208->185|209->186|210->187|210->187|211->188|211->188|212->189|212->189|213->190|213->190|214->191|214->191|218->195|218->195|219->196|223->200|223->200|224->201|224->201|225->202|232->209|232->209
                  -- GENERATED --
              */
          