package com.mikhaellopez.androidwebserver;

import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

/**
 * Created by Mikhael LOPEZ on 14/12/2015.
 */
public class AndroidWebServer extends NanoHTTPD {

    public AndroidWebServer(int port) {
        super(port);
        response = msgItalia;
    }

    public AndroidWebServer(String hostname, int port) {
        super(hostname, port);
        response = msgItalia;
    }

    @Override
    public Response serve(IHTTPSession session) {
        return newFixedLengthResponse(response);
    }

    public void setTrainType(boolean isDeutscheBahn) {
        if (isDeutscheBahn) {
            response = msgDeutschland;
        } else {
            response = msgItalia;
        }
    }

    private String response;

    private String msgDeutschland = "{\"connection\":true,\"servicelevel\":\"AVAILABLE_SERVICE\",\"speed\":38,\"gpsStatus\":\"VALID\",\"latitude\":" + 49.29154586791992 + ",\"longitude\":" + 11.403055191040039 + ",\"serverTime\":1517990410340,\"wagonClass\":\"SECOND\",\"navigationChange\":\"2018-02-07-04-17-40\"}";

    String msgItalia = "\n" +
            "<!DOCTYPE>\n" +
            "<html>\n" +
            "\n" +
            "\t<head>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<!-- Necessario per gestire bene la compatibilitÃ  di IE > 8 -->\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n" +
            "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n" +
            "\n" +
            "<link type=\"text/css\" rel=\"stylesheet\" href=\"css/ALMV_d6onde.css\" />\n" +
            "<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n" +
            "<script type=\"text/javascript\" src=\"js/plugins/jquery-ui-1.10.3.custom.min.js\"></script>\n" +
            "<script type=\"text/javascript\" src=\"js/mobrix.js\"></script>\n" +
            "<script type=\"text/javascript\" src=\"js/ALMV_d6onde.js\"></script>\n" +
            "<script type=\"text/javascript\" src=\"js/plugins/cookies/jquery.cookie.js\"></script>\n" +
            "<!-- jscrollpane -->\n" +
            "<link type=\"text/css\" rel=\"stylesheet\" href=\"js/plugins/jscrollpane/jquery.jscrollpane.css\" />\n" +
            "<script type=\"text/javascript\" src=\"js/plugins/jscrollpane/jquery.mousewheel.js\"></script>\n" +
            "<script type=\"text/javascript\" src=\"js/plugins/jscrollpane/jquery.jscrollpane.min.js\"></script>\n" +
            "<!-- fancybox -->\n" +
            "<link rel=\"stylesheet\" href=\"js/plugins/fancybox/source/jquery.fancybox.css?v=2.1.5\" type=\"text/css\" media=\"screen\" />\n" +
            "<script type=\"text/javascript\" src=\"js/plugins/fancybox/source/jquery.fancybox.pack.js?v=2.1.5\"></script>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<meta name=\"widgetid\" content=\"11\">\n" +
            "<meta name=\"widgetname\" content=\"infoviaggio\">\n" +
            "<meta name=\"userid\" content=\"null\">\n" +
            "<meta name=\"clientid\" content=\"05e62ed3-9f42-4b0c-baf6-601afeaa8d2d\">\n" +
            "<meta name=\"clienttype\" conetnt=\"pc/windows/10\">\n" +
            "<meta name=\"browsertype\" content=\"chrome/65.0.3325.181\">\n" +
            "<meta name=\"debugenabled\" content=\"false\">\n" +
            "<meta name=\"oba\" content=\"1.22.5.10\">\n" +
            "<meta name=\"modules\" content=\"5.58.5.31\">\n" +
            "<meta name=\"web\" content=\"2.007.003.021\">\n" +
            "<style tyle=\"text/css\">\n" +
            "\tbody {\n" +
            "\t\toverflow: hidden;\n" +
            "\t\tbackground-image: url('images/widgetcommon/11_radial.png');\n" +
            "\t}\n" +
            "</style>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/widgetmenu.css\" />\n" +
            "\t\t<title>Infoviaggio</title>\n" +
            "\n" +
            "\t</head>\n" +
            "\t<!-- ALMV_WIDGET_BODY_START -->\n" +
            "\t<body id=\"ALMV_body\" class=\"infoViaggioFullBackgroundRadial\">\n" +
            "\t\t<div id=\"version\" class=\"hidden\" data-version=\"2.007.003.021\"></div>\n" +
            "\t\t<div id=\"obaversion\" class=\"hidden\" data-version=\"1.22.5.10\"></div>\n" +
            "\n" +
            "\t\t<div id=\"ALMV_fullPageContainer\">\n" +
            "\t\t\t<div id=\"ALMV_infoviaggioMenuPart\">\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<ul id=\"ALMV_menuBar\">\n" +
            "<!-- TODO: aggiungere un livello di action per permettere la click analisis del menu di 2nd livello su infoviaggio -->\n" +
            "\t<li class=\"active\" data-linkto=\"integration?ALMV_widgetid=1020\">Travel info</li>\n" +
            "\t<li\n" +
            "\n" +
            "\t class=\"\" id=\"m53menu\" data-linkto=\"integration?ALMV_widgetid=1000\">Next station billboard</li>\n" +
            "</ul>\n" +
            "\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "var infoviaggioFullPartTimeout;\n" +
            "var infoviaggioFullPartInterval;\n" +
            "\n" +
            "$(document).ready(function() {\n" +
            "\tvar lis = $('#ALMV_menuBar li[data-linkto]');\n" +
            "\tvar cont = $('#ALMV_infoviaggioFullPart');\n" +
            "\n" +
            "\tlis.click(function() {\n" +
            "\t\tclearInterval(infoviaggioFullPartInterval);\n" +
            "\t\tclearTimeout(infoviaggioFullPartTimeout);\n" +
            "\t\tinfoviaggioFullPartInterval = null;\n" +
            "\t\tinfoviaggioFullPartTimeout = null;\n" +
            "\t\tlis.removeClass('active');\n" +
            "\t\tvar url = $(this).data('linkto');\n" +
            "\t\tif( url ) {\n" +
            "\t\t\tif( url.indexOf('?') != -1 )\n" +
            "\t\t\t\turl += '&';\n" +
            "\t\t\telse\n" +
            "\t\t\t\turl += '?';\n" +
            "\n" +
            "\t\t\turl += \"tlcm_clientid=\" + APP.Env.clientId;\n" +
            "\t\t\tcont.attr(\"data-backtitle\", $(this).text());\n" +
            "\t\t\tcont.fadeOut('fast', function() {\n" +
            "\t\t\t\tcont.css('cursor', 'wait');\n" +
            "\t\t\t\tcont.load(url, function() {\n" +
            "\t\t\t\t\tcont.fadeIn('slow', function() {\n" +
            "\t\t\t\t\t\tcont.css('cursor', 'auto');\n" +
            "\t\t\t\t\t});\n" +
            "\t\t\t\t});\n" +
            "\t\t\t});\n" +
            "\t\t\t$(this).addClass('active');\n" +
            "\t\t}\n" +
            "\t});\n" +
            "});\n" +
            "\n" +
            "</script>\n" +
            "\t\t\t</div>\n" +
            "\t\t\t<div id=\"ALMV_infoviaggioFullPart\" data-lasturl=\"\">\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<style type=\"text/css\">\n" +
            "\n" +
            ".futuraFont {\n" +
            "\t/*font-family: \"futura_lt\";*/\n" +
            "}\n" +
            "\n" +
            "body, html {\n" +
            "\tmargin: 0;\n" +
            "}\n" +
            "\n" +
            "#header {\n" +
            "\tcolor: #FFF;\n" +
            "    padding: 10px 10px 2px 10px;\n" +
            "    font-size: 15pt;\n" +
            "    text-shadow: 0 1px 1px rgba(0,0,0,.5);\n" +
            "    font-weight: bold;\n" +
            "}\n" +
            "\n" +
            "#header > div:not([id=\"ivRit\"]) {\n" +
            "\tdisplay: inline-block;\n" +
            "}\n" +
            "\n" +
            "#gps {\n" +
            "\tcolor: #FFF;\n" +
            "}\n" +
            "\n" +
            ".colmask {\n" +
            "\theight: 307px;\n" +
            "\tbackground-color: rgba(15, 15, 15, 0.73);\n" +
            "\tcolor: #FFF;\n" +
            "\tclear: both;\n" +
            "}\n" +
            "\n" +
            ".colleft {\n" +
            "\t/*float: left;*/\n" +
            "\twidth: 99%;\n" +
            "\tmargin-left: auto;\n" +
            "\tmargin-right: auto;\n" +
            "}\n" +
            "\n" +
            ".col1 {\n" +
            "\tfloat: left;\n" +
            "}\n" +
            "\n" +
            ".col2 {\n" +
            "    text-align: right;\n" +
            "    float: right;\n" +
            "    width: 590px;\n" +
            "}\n" +
            "\n" +
            "#mapPH {\n" +
            "\tposition: absolute;\n" +
            "\twidth: 590px;\n" +
            "\theight: 282px;\n" +
            "\tmargin-left: 240px;\n" +
            "\ttext-align: center;\n" +
            "\tline-height: 282px;\n" +
            "}\n" +
            "\n" +
            ".col1 > img {\n" +
            "\tmargin: 4px;\n" +
            "\tmargin-right: 0px;\n" +
            "\tmargin-bottom: 0px;\n" +
            "}\n" +
            "\n" +
            "#footer {\n" +
            "\tcolor: #FFF;\n" +
            "\toverflow:hidden;\n" +
            "\tpadding: 5px 10px 0 10px;\n" +
            "}\n" +
            "\n" +
            "#ivSpeed {\n" +
            "\tfloat: left;\n" +
            "\tbox-sizing: border-box;\n" +
            "\t-moz-box-sizing: border-box;\n" +
            "\tleft: 0;\n" +
            "\t/*top: 66px;*/\n" +
            "\theight: 40px;\n" +
            "\tfont-size: 11pt;\n" +
            "\twidth: 320px;\n" +
            "\tbackground: url(/PortaleFrecce/pages/images/infoviaggio/baffo_01.png) no-repeat center right;\n" +
            "\tbackground-size: 40px 100%;\n" +
            "}\n" +
            "\n" +
            "#ivOnTime {\n" +
            "\tbackground: url(/PortaleFrecce/pages/images/infoviaggio/clock.png) no-repeat 0 0;\n" +
            "\tpadding: 0 0 0 25px;\n" +
            "\tfont-weight: normal;\n" +
            "\tfont-style: normal;\n" +
            "\tbackground-size: 18px auto;\n" +
            "\tfont-size: 11pt;\n" +
            "}\n" +
            "\n" +
            "#ivOnTime span {\n" +
            "\tfont-style: italic;\n" +
            "\tfont-weight: bold;\n" +
            "\tfont-size: 1em;\n" +
            "}\n" +
            "\n" +
            "#ivGpsData {\n" +
            "\t-moz-box-sizing: border-box;\n" +
            "\tbox-sizing: border-box;\n" +
            "\tmargin: 0 0 0 320px;\n" +
            "\tpadding: 0 5px 5px 5px;\n" +
            "\ttext-align: right;\n" +
            "\tbackground-color: rgba(15, 15, 15, 0.73);\n" +
            "\tfont-size: 12px;\n" +
            "\theight: 40px;\n" +
            "\toverflow: hidden;\n" +
            "}\n" +
            "\n" +
            "#ivSpeedValue {\n" +
            "\tfont-family: Digital-7Italic;\n" +
            "\tfont-size: 34px;\n" +
            "}\n" +
            "\n" +
            ".orangeGlow {\n" +
            "\ttext-shadow: 0 0 5px #FF5A00;\n" +
            "}\n" +
            "\n" +
            ".ivCoord {\n" +
            "\tfloat: right;\n" +
            "\tmargin: 1px 8px;\n" +
            "}\n" +
            "\n" +
            ".ivCoord td {\n" +
            "\twidth: 45px;\n" +
            "}\n" +
            "\n" +
            ".ivHeading {\n" +
            "\tfloat: right;\n" +
            "\tmargin: 1px 8px;\n" +
            "}\n" +
            "\n" +
            "#ivRit, #ivOnTime {\n" +
            "\tfloat: right;\n" +
            "\tfont-size: 80%;\n" +
            "\tmargin-top: 5px;\n" +
            "}\n" +
            "\n" +
            "/*\n" +
            "#ivLat:before {\n" +
            "\tcontent: 'Lat.:';\n" +
            "\tmargin-right: 7px;\n" +
            "}\n" +
            "#ivLon:before {\n" +
            "\tcontent: 'Lon.:';\n" +
            "\tmargin-right: 7px;\n" +
            "}\n" +
            "\n" +
            "#ivAlt:before {\n" +
            "\tcontent: 'Alt.:';\n" +
            "\tmargin-right: 7px;\n" +
            "}\n" +
            "#ivDir:before {\n" +
            "\tcontent: 'Compass:';\n" +
            "\tmargin-right: 7px;\n" +
            "}\n" +
            "#ivDir:after {\n" +
            "\tcontent: '\\00B0';\n" +
            "}\n" +
            "*/\n" +
            "\n" +
            ".stazioni {\n" +
            "\tdisplay: inline-block;\n" +
            "\twidth: 200px;\n" +
            "\tfont-size: 8pt;\n" +
            "\ttext-align: left;\n" +
            "\tpadding: 0 0 4px 0;\n" +
            "}\n" +
            ".stazioni:last-of-type, .orari:last-of-type {\n" +
            "\twidth: auto;\n" +
            "}\n" +
            "\n" +
            ".orari {\n" +
            "\tdisplay: inline-block;\n" +
            "\twidth: 200px;\n" +
            "\tfont-size: 8pt;\n" +
            "\tpadding: 4px 0 0 0;\n" +
            "}\n" +
            "\n" +
            ".bullet {\n" +
            "\theight: 10px;\n" +
            "\twidth: 200px;\n" +
            "\tdisplay: inline-block;\n" +
            "\tfont-size: 14pt;\n" +
            "\tpadding: 0;\n" +
            "}\n" +
            ".bullet > div {\n" +
            "\twidth: 4px;\n" +
            "\theight: 4px;\n" +
            "\tborder-radius: 15px;\n" +
            "\tbackground-color: rgba(255,255,255,.8);\n" +
            "\tborder: 1px solid #fff;\"\n" +
            "}\n" +
            ".bullet:first-of-type {\n" +
            "\tpadding-left: 2px;\n" +
            "}\n" +
            ".bullet:last-of-type {\n" +
            "\twidth: 210px;\n" +
            "}\n" +
            "\n" +
            "\n" +
            ".ivStazBull {\n" +
            "\tposition: relative;\n" +
            "\tfont-size: 20px;\n" +
            "}\n" +
            "\n" +
            ".rightMargin10 {\n" +
            "\twidth: 120%;\n" +
            "\twhite-space: nowrap;\n" +
            "\tmargin-right: 10px;\n" +
            "}\n" +
            "\n" +
            "#ivPercLine {\n" +
            "\twhite-space: nowrap;\n" +
            "\tborder-radius: 15px;\n" +
            "\tbackground: #7d7e7d; /* Old browsers */\n" +
            "\t/* IE9 SVG, needs conditional override of 'filter' to 'none' */\n" +
            "\tbackground: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzdkN2U3ZCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjYxJSIgc3RvcC1jb2xvcj0iIzBlMGUwZSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9Ijk0JSIgc3RvcC1jb2xvcj0iIzBlMGUwZSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiM5Njk2OTYiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);\n" +
            "\tbackground: -moz-linear-gradient(top, #7d7e7d 0%, #0e0e0e 61%, #0e0e0e 94%, #969696 100%); /* FF3.6+ */\n" +
            "\tbackground: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#7d7e7d), color-stop(61%,#0e0e0e), color-stop(94%,#0e0e0e), color-stop(100%,#969696)); /* Chrome,Safari4+ */\n" +
            "\tbackground: -webkit-linear-gradient(top, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* Chrome10+,Safari5.1+ */\n" +
            "\tbackground: -o-linear-gradient(top, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* Opera 11.10+ */\n" +
            "\tbackground: -ms-linear-gradient(top, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* IE10+ */\n" +
            "\tbackground: linear-gradient(to bottom, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* W3C */\n" +
            "\tfilter: none;\n" +
            "}\n" +
            "\n" +
            "#ivLinePassed {\n" +
            "\theight: 10px;\n" +
            "\tbackground-color: #FA6300;\n" +
            "\tborder: 1px solid #fff;\n" +
            "\tborder-radius: 15px;\n" +
            "\ttransition-property: width;\n" +
            "\ttransition-duration: .2s;\n" +
            "\tbox-shadow: inset 0 2px 5px -2px rgba(0, 0, 0, .8);\n" +
            "}\n" +
            "\n" +
            "#ALMV_tachimeter {\n" +
            "\tposition: relative;\n" +
            "\ttop: 4px;\n" +
            "}\n" +
            "\n" +
            "#mapText {\n" +
            "\tfont-size: 10px;\n" +
            "\tmargin-right: 6px;\n" +
            "\tcolor: #ccc;\n" +
            "\tdisplay: inline-table;\n" +
            "}\n" +
            "\n" +
            ".draggableY {\n" +
            "\tposition: relative;\n" +
            "\t/*cursor: move;*/\n" +
            "\tleft: 15px;\n" +
            "}\n" +
            "\n" +
            "#ivBigMap {\n" +
            "\tborder-radius: 3px;\n" +
            "\tmargin: 10px 4px 0 0;\n" +
            "}\n" +
            "\n" +
            ".footerButtons {\n" +
            "\ttop: 414px;\n" +
            "\tbackground-color: #000;\n" +
            "\tz-index: 999;\n" +
            "\tcursor: pointer;\n" +
            "\tfont-size: 14px;\n" +
            "\ttext-align: center;\n" +
            "\tposition: absolute;\n" +
            "\tpadding-top: 23px;\n" +
            "\theight: 31px;\n" +
            "}\n" +
            "\n" +
            ".footerButtons:hover {\n" +
            "\tcolor: #F00;\n" +
            "\ttext-shadow: 0 0 15px rgba(255,0,0, 1);\n" +
            "}\n" +
            "\n" +
            "#buttonLeft {\n" +
            "\tpadding: 23px 15px 0 5px;\n" +
            "\tleft: 0;\n" +
            "\t/* IE9 SVG, needs conditional override of 'filter' to 'none' */\n" +
            "\tbackground: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIxMDAlIiB5Mj0iMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzAwMDAwMCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjUwJSIgc3RvcC1jb2xvcj0iIzAwMDAwMCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiMwMDAwMDAiIHN0b3Atb3BhY2l0eT0iMCIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);\n" +
            "\tbackground: -moz-linear-gradient(left, rgba(0,0,0,1) 0%, rgba(0,0,0,1) 50%, rgba(0,0,0,0) 100%); /* FF3.6+ */\n" +
            "\tbackground: -webkit-gradient(linear, left top, right top, color-stop(0%,rgba(0,0,0,1)), color-stop(50%,rgba(0,0,0,1)), color-stop(100%,rgba(0,0,0,0))); /* Chrome,Safari4+ */\n" +
            "\tbackground: -webkit-linear-gradient(left, rgba(0,0,0,1) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,0) 100%); /* Chrome10+,Safari5.1+ */\n" +
            "\tbackground: -o-linear-gradient(left, rgba(0,0,0,1) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,0) 100%); /* Opera 11.10+ */\n" +
            "\tbackground: -ms-linear-gradient(left, rgba(0,0,0,1) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,0) 100%); /* IE10+ */\n" +
            "\tbackground: linear-gradient(to right, rgba(0,0,0,1) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,0) 100%); /* W3C */\n" +
            "\tfilter: none;\n" +
            "}\n" +
            "\n" +
            "#buttonRight {\n" +
            "\tpadding: 23px 5px 0 15px;\n" +
            "\tright: 0;\n" +
            "\t/* IE9 SVG, needs conditional override of 'filter' to 'none' */\n" +
            "\tbackground: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIxMDAlIiB5Mj0iMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzAwMDAwMCIgc3RvcC1vcGFjaXR5PSIwIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjUwJSIgc3RvcC1jb2xvcj0iIzAwMDAwMCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiMwMDAwMDAiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);\n" +
            "\tbackground: -moz-linear-gradient(left, rgba(0,0,0,0) 0%, rgba(0,0,0,1) 50%, rgba(0,0,0,1) 100%); /* FF3.6+ */\n" +
            "\tbackground: -webkit-gradient(linear, left top, right top, color-stop(0%,rgba(0,0,0,0)), color-stop(50%,rgba(0,0,0,1)), color-stop(100%,rgba(0,0,0,1))); /* Chrome,Safari4+ */\n" +
            "\tbackground: -webkit-linear-gradient(left, rgba(0,0,0,0) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,1) 100%); /* Chrome10+,Safari5.1+ */\n" +
            "\tbackground: -o-linear-gradient(left, rgba(0,0,0,0) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,1) 100%); /* Opera 11.10+ */\n" +
            "\tbackground: -ms-linear-gradient(left, rgba(0,0,0,0) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,1) 100%); /* IE10+ */\n" +
            "\tbackground: linear-gradient(to right, rgba(0,0,0,0) 0%,rgba(0,0,0,1) 50%,rgba(0,0,0,1) 100%); /* W3C */\n" +
            "\tfilter: none;\n" +
            "}\n" +
            "\n" +
            "area {\n" +
            "\toutline: none;\n" +
            "\tcursor: pointer;\n" +
            "}\n" +
            "\n" +
            "area:focus {\n" +
            "\toutline: none;\n" +
            "}\n" +
            "\n" +
            "area:active {\n" +
            "\toutline: none;\n" +
            "}\n" +
            "\n" +
            ".ui-tooltip {\n" +
            "\tposition: absolute;\n" +
            "\tbackground-color: #EEE;\n" +
            "\tborder: 1px solid #555;\n" +
            "\tbox-shadow: 0 2px 4px rgba(0,0,0,.4);\n" +
            "\tpadding: 3px 5px;\n" +
            "\tborder-radius: 3px;\n" +
            "}\n" +
            "\n" +
            ".ui-tooltip-content {\n" +
            "\tcolor: #333;\n" +
            "}\n" +
            "\n" +
            "#ALMV_fullPageContainer {\n" +
            "\tmin-width: 876px;\n" +
            "\tmin-height: 474px;\n" +
            "}\n" +
            "\n" +
            "</style>\n" +
            "\n" +
            "<div id=\"header\" class=\"futuraFont\">\n" +
            "\t<div id=\"ivClassifica\"><img src=\"\" /></div>\n" +
            "\t<div id=\"ivNumTreno\">9642</div>\n" +
            "\t<div id=\"ivPartArr\">Napoli Centrale &rarr; Milano Centrale</div>\n" +
            "\t<div id=\"ivRit\"></div>\n" +
            "    <div id=\"ivOnTime\"></div>\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<div id=\"gps\" class=\"futuraFont\">\n" +
            "\t<div id=\"ivSpeed\">\n" +
            "\t\t<div style=\"margin: 6px 0 0 8px;\">\n" +
            "\t\t\ttrain speed <img id=\"ALMV_tachimeter\" src=\"/PortaleFrecce/pages/images/infoviaggio/guage.png\">\n" +
            "\t\t\t<span id=\"ivSpeedValue\" class=\"orangeGlow\">111</span>&nbsp;<span id=\"ivSpeedUnit\">Km/h</speed>\n" +
            "\t\t</div>\n" +
            "\t</div>\n" +
            "\t<div id=\"ivGpsData\">\n" +
            "\t\t<table class=\"ivCoord\" style=\"\" >\n" +
            "\t\t\t<tbody>\n" +
            "\t\t\t\t<tr>\n" +
            "\t\t\t\t\t<td>Lat.:</td>\n" +
            "\t\t\t\t\t<td id=\"ivLat\">42.495</td>\n" +
            "\t\t\t\t\t<td>Lon.:</td>\n" +
            "\t\t\t\t\t<td id=\"ivLon\">12.311</td>\n" +
            "\t\t\t\t</tr>\n" +
            "\t\t\t\t<tr>\n" +
            "\t\t\t\t\t<td>Compass:</td>\n" +
            "\t\t\t\t\t<td id=\"ivDir\">N-W</td>\n" +
            "\t\t\t\t\t<td>Alt.:</td>\n" +
            "\t\t\t\t\t<td id=\"ivAlt\">74.0</td>\n" +
            "\t\t\t\t</tr>\n" +
            "\t\t\t</tbody>\n" +
            "\t\t</table>\n" +
            "\t</div>\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "<div class=\"colmask\" class=\"futuraFont\">\n" +
            "\t<div class=\"colleft\">\n" +
            "\t\t<div class=\"col1\">\n" +
            "\t\t\t<!-- Column 1 start -->\n" +
            "\n" +
            "\t\t\t<img usemap=\"#tracklinemap\" src=\"/PortaleFrecce/trackLineAction.action?image=bg.png&amp;cs=20&amp;st=8\" width=\"256\"/>\n" +
            "\t\t\t<map name=\"tracklinemap\">\n" +
            "\n" +
            "\t\t\t\t<area\n" +
            "\t\t\t\t\tonfocus=\"javascript: blur();\"\n" +
            "\t\t\t\t\tclass=\"mapArea\"\n" +
            "\t\t\t\t\tshape=\"circle\"\n" +
            "\t\t\t\t\tcoords=\"127.0,155.0,5\"\n" +
            "\t\t\t\t\ttitle=\"ROMA TERMINI\"\n" +
            "\t\t\t\t\thref=\"javascript:void(0);\"\n" +
            "\t\t\t\t\t>\n" +
            "\t\t\t\t</area>\n" +
            "\n" +
            "\t\t\t\t<area\n" +
            "\t\t\t\t\tonfocus=\"javascript: blur();\"\n" +
            "\t\t\t\t\tclass=\"mapArea\"\n" +
            "\t\t\t\t\tshape=\"circle\"\n" +
            "\t\t\t\t\tcoords=\"165.0,184.0,5\"\n" +
            "\t\t\t\t\ttitle=\"NAPOLI CENTRALE\"\n" +
            "\t\t\t\t\thref=\"javascript:void(0);\"\n" +
            "\t\t\t\t\t>\n" +
            "\t\t\t\t</area>\n" +
            "\n" +
            "\t\t\t\t<area\n" +
            "\t\t\t\t\tonfocus=\"javascript: blur();\"\n" +
            "\t\t\t\t\tclass=\"mapArea\"\n" +
            "\t\t\t\t\tshape=\"circle\"\n" +
            "\t\t\t\t\tcoords=\"58.0,50.0,5\"\n" +
            "\t\t\t\t\ttitle=\"MILANO CENTRALE\"\n" +
            "\t\t\t\t\thref=\"javascript:void(0);\"\n" +
            "\t\t\t\t\t>\n" +
            "\t\t\t\t</area>\n" +
            "\n" +
            "\t\t\t\t<area\n" +
            "\t\t\t\t\tonfocus=\"javascript: blur();\"\n" +
            "\t\t\t\t\tclass=\"mapArea\"\n" +
            "\t\t\t\t\tshape=\"circle\"\n" +
            "\t\t\t\t\tcoords=\"59.0,52.0,5\"\n" +
            "\t\t\t\t\ttitle=\"MILANO ROGOREDO\"\n" +
            "\t\t\t\t\thref=\"javascript:void(0);\"\n" +
            "\t\t\t\t\t>\n" +
            "\t\t\t\t</area>\n" +
            "\n" +
            "\t\t\t</map>\n" +
            "\t\t\t<!-- Column 1 end -->\n" +
            "\t\t</div>\n" +
            "\t\t<div class=\"col2\" style=\"\">\n" +
            "\t\t\t<!-- Column 2 start -->\n" +
            "\t\t\t<img id=\"ivBigMap\" width=\"590\" height=\"282\" data-url=\"/PortaleFrecce/mapAction.action?width=590&amp;height=282\" src=\"/PortaleFrecce/mapAction.action?width=590&amp;height=282\" />\n" +
            "\t\t\t<span id=\"mapText\" >The map shows, constantly updated, the current position of the train along the route</span>\n" +
            "\t\t\t<!-- Column 2 end -->\n" +
            "\t\t</div>\n" +
            "\t\t<div id=\"mapPH\" style=\"display: none;\" class=\"pageTitle\">\n" +
            "\t\t\tSorry, GPS data not available\n" +
            "\t\t</div>\n" +
            "\t</div>\n" +
            "</div>\n" +
            "<div id=\"footer\" class=\"futuraFont\" style=\"\">\n" +
            "\t<div id=\"buttonLeft\" class=\" footerButtons\"><i class=\"fa fa-caret-left\"></i></div>\n" +
            "\t<div id=\"buttonRight\" class=\" footerButtons\"><i class=\"fa fa-caret-right\"></i></div>\n" +
            "\t<div class=\"draggableY\">\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<style type=\"text/css\">\n" +
            "#ivStationsListContainer {\n" +
            "\toverflow: hidden;\n" +
            "\tposition: relative;\n" +
            "\twidth: 800px;\n" +
            "}\n" +
            "\n" +
            "#ivStationsList {\n" +
            "\toverflow: hidden;\n" +
            "\twidth: auto;\n" +
            "\tposition: relative;\n" +
            "\theight: 54px;\n" +
            "\tmargin: 0;\n" +
            "\tpadding: 0;\n" +
            "\twidth: 800px;\n" +
            "}\n" +
            "\n" +
            ".ivStatElement {\n" +
            "\twidth: 200px;\n" +
            "\tfont-size: 8pt;\n" +
            "\tfloat: left;\n" +
            "\theight: 54px;\n" +
            "\tmargin: 5px 0 0 0;\n" +
            "\tpadding: 0;\n" +
            "\tcolor: white;\n" +
            "}\n" +
            "\n" +
            ".ivPercorso {\n" +
            "\twhite-space: nowrap;\n" +
            "\t/*border-radius: 15px;*/\n" +
            "\tbackground: #7d7e7d; /* Old browsers */\n" +
            "\t/* IE9 SVG, needs conditional override of 'filter' to 'none' */\n" +
            "\tbackground: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzdkN2U3ZCIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjYxJSIgc3RvcC1jb2xvcj0iIzBlMGUwZSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9Ijk0JSIgc3RvcC1jb2xvcj0iIzBlMGUwZSIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiM5Njk2OTYiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);\n" +
            "\tbackground: -moz-linear-gradient(top, #7d7e7d 0%, #0e0e0e 61%, #0e0e0e 94%, #969696 100%); /* FF3.6+ */\n" +
            "\tbackground: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#7d7e7d), color-stop(61%,#0e0e0e), color-stop(94%,#0e0e0e), color-stop(100%,#969696)); /* Chrome,Safari4+ */\n" +
            "\tbackground: -webkit-linear-gradient(top, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* Chrome10+,Safari5.1+ */\n" +
            "\tbackground: -o-linear-gradient(top, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* Opera 11.10+ */\n" +
            "\tbackground: -ms-linear-gradient(top, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* IE10+ */\n" +
            "\tbackground: linear-gradient(to bottom, #7d7e7d 0%,#0e0e0e 61%,#0e0e0e 94%,#969696 100%); /* W3C */\n" +
            "\tfilter: none;\n" +
            "\n" +
            "\tmargin: 0;\n" +
            "\tpadding: 0;\n" +
            "\theight: 17px;\n" +
            "}\n" +
            "\n" +
            ".ivStatElement:first-child .ivPercorso, .ivStatElement:first-child .ivPercorsoPercent {\n" +
            "\t-webkit-border-top-left-radius: 15px;\n" +
            "\t-webkit-border-bottom-left-radius: 15px;\n" +
            "\t-moz-border-radius-topleft: 15px;\n" +
            "\t-moz-border-radius-bottomleft: 15px;\n" +
            "\tborder-top-left-radius: 15px;\n" +
            "\tborder-bottom-left-radius: 15px;\n" +
            "}\n" +
            "\n" +
            ".ivStatElement:last-child .ivPercorso, .ivStatElement:last-child .ivPercorsoPercent {\n" +
            "\t-webkit-border-top-right-radius: 15px;\n" +
            "\t-webkit-border-bottom-right-radius: 15px;\n" +
            "\t-moz-border-radius-topright: 15px;\n" +
            "\t-moz-border-radius-bottomright: 15px;\n" +
            "\tborder-top-right-radius: 15px;\n" +
            "\tborder-bottom-right-radius: 15px;\n" +
            "\n" +
            "\twidth: 20px;\n" +
            "}\n" +
            "\n" +
            ".ivPercorsoPercent{\n" +
            "\tpadding: 0;\n" +
            "\tborder: 0;\n" +
            "\tdisplay: block;\n" +
            "}\n" +
            "\n" +
            ".enlighted {\n" +
            "\tborder-top: 1px solid #fff;\n" +
            "\tborder-bottom: 1px solid #fff;\n" +
            "\tbackground-color: #FA6300;\n" +
            "}\n" +
            "\n" +
            ".enlighted-closed {\n" +
            "\t-webkit-border-top-right-radius: 15px;\n" +
            "\t-webkit-border-bottom-right-radius: 15px;\n" +
            "\t-moz-border-radius-topright: 15px;\n" +
            "\t-moz-border-radius-bottomright: 15px;\n" +
            "\tborder-top-right-radius: 15px;\n" +
            "\tborder-bottom-right-radius: 15px;\n" +
            "\tborder-right: 1px solid #fff;\n" +
            "}\n" +
            "\n" +
            ".ivStatElement:first-child .enlighted {\n" +
            "\tborder-left: 1px solid #fff;\n" +
            "}\n" +
            "\n" +
            ".ivStatElement:last-child .enlighted  {\n" +
            "\tborder-right: 1px solid #fff;\n" +
            "}\n" +
            "\n" +
            "</style>\n" +
            "\n" +
            "\t<div id=\"ivStationsListContainer\">\n" +
            "\t\t<ul id=\"ivStationsList\">\n" +
            "\n" +
            "\t\t\t<li class=\"ivStatElement\" id=\"0\">\n" +
            "\t\t\t\t<div class=\"ivStation\"><span>NAPOLI CENTRALE</span></div>\n" +
            "\t\t\t\t<div class=\"ivPercorso\"><span class=\"ivPercorsoPercent enlighted\" style=\"width: 100%;\">&nbsp;&#9899;</span></div>\n" +
            "\t\t\t\t<div class=\"ivOrari\"><span>14:40\n" +
            "\t\t\t\t\t</span></div>\n" +
            "\t\t\t</li>\n" +
            "\n" +
            "\t\t\t<li class=\"ivStatElement\" id=\"1\">\n" +
            "\t\t\t\t<div class=\"ivStation\"><span>ROMA TERMINI</span></div>\n" +
            "\t\t\t\t<div class=\"ivPercorso\"><span class=\"ivPercorsoPercent enlighted enlighted-closed\" style=\"width: 14%;\">&nbsp;&#9899;</span></div>\n" +
            "\t\t\t\t<div class=\"ivOrari\"><span>\n" +
            "\t\t\t\t\t15:47</span></div>\n" +
            "\t\t\t</li>\n" +
            "\n" +
            "\t\t\t<li class=\"ivStatElement\" id=\"2\">\n" +
            "\t\t\t\t<div class=\"ivStation\"><span>MILANO ROGOREDO</span></div>\n" +
            "\t\t\t\t<div class=\"ivPercorso\"><span class=\"ivPercorsoPercent \" style=\"width: 0%;\">&nbsp;&#9899;</span></div>\n" +
            "\t\t\t\t<div class=\"ivOrari\"><span>\n" +
            "\t\t\t\t\t18:48</span></div>\n" +
            "\t\t\t</li>\n" +
            "\n" +
            "\t\t\t<li class=\"ivStatElement\" id=\"3\">\n" +
            "\t\t\t\t<div class=\"ivStation\"><span>MILANO CENTRALE</span></div>\n" +
            "\t\t\t\t<div class=\"ivPercorso\"><span class=\"ivPercorsoPercent \" style=\"width: 0%;\">&nbsp;&#9899;</span></div>\n" +
            "\t\t\t\t<div class=\"ivOrari\"><span>\n" +
            "\t\t\t\t\t18:59</span></div>\n" +
            "\t\t\t</li>\n" +
            "\n" +
            "\t\t</ul>\n" +
            "\t</div>\n" +
            "\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "\tvar updatePercorso = function() {\n" +
            "\t\t$('.draggableY').load('percorsoAction', function() {\n" +
            "\t\t\tmoveDraggable();\n" +
            "\t\t\tAPP.logger.debug('Percorso updated');\n" +
            "\t\t});\n" +
            "\t};\n" +
            "\n" +
            "\tvar moveDraggable = function() {\n" +
            "\t\tvar scrollPosDiv = $('#ivStationsListContainer');\n" +
            "\t\tif( scrollPosDiv ) {\n" +
            "\t\t\tvar pos = $( \".ivPercorsoPercent.enlighted.enlighted-closed\" ).position().left - 437; //437 è la metà di 874, la larghezza totale del widget\n" +
            "\t\t\tscrollPosDiv.attr(\"data-trainpos2\", pos);\n" +
            "\t\t\t$('.draggableY').animate({left: -scrollPosDiv.attr(\"data-trainpos2\"), speed: 'slow'})\n" +
            "\t\t}\n" +
            "\t};\n" +
            "\n" +
            "\t$(document).ready(function() {\n" +
            "\t\t// delay per scrollare il percorso sulla posizione attuale\n" +
            "\t\t//setTimeout('moveDraggable()', 5000);\n" +
            "\n" +
            "\t\t// ripianificazione dell' auto-update del widget\n" +
            "\t\tsetTimeout('updatePercorso()', 5000);\n" +
            "\t});\n" +
            "\n" +
            "</script>\n" +
            "\n" +
            "\n" +
            "\t</div>\n" +
            "</div>\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "\tvar resetGpsView = function(visible) {\n" +
            "\t\tvar elements = $('.col2, .ivCoord');\n" +
            "\t\t//$('#ivOnTime').hide().html(\"\");\n" +
            "\t\tif( visible ) {\n" +
            "\t\t\t$('#mapPH').fadeOut();\n" +
            "\t\t\telements.fadeIn();\n" +
            "\t\t}\n" +
            "\t\telse {\n" +
            "\t\t\telements.fadeOut();\n" +
            "\t\t\t$('#mapPH').fadeIn();\n" +
            "\t\t}\n" +
            "\t};\n" +
            "\n" +
            "\tvar imgSrc = \"\";\n" +
            "\n" +
            "\tvar updateViaggio = function() {\n" +
            "\t\tif( imgSrc == '')\n" +
            "\t\t\timgSrc = $('.col1 img').attr('src');\n" +
            "\n" +
            "\t\tvar mappaCont = $('.col2');\n" +
            "\t\tvar ts = new Date().getTime();\n" +
            "\t\t$('#ivBigMap').attr('src', $('#ivBigMap').attr('data-url') + \"&ts=\" + ts);\n" +
            "\t\t$('.col1 img').attr('src', imgSrc + \"&ts=\" + ts);\n" +
            "\n" +
            "\t\t$.getJSON('infoViaggioActionJson', function(data) {\n" +
            "\t\t\tvar cat = 'images/general/empty.png';\n" +
            "\t\t\tif( data != null ) {\n" +
            "\t\t\t\tif( data.isTrackOnGPS ) {\n" +
            "\t\t\t\t\t$('#ivNumTreno').text(data.tracknum);\n" +
            "\t\t\t\t\t//$('#ivRit, #ivOnTime').hide();\n" +
            "\t\t\t\t\tif(data.delay != ''){\n" +
            "\t\t\t\t\t\t$('#ivRit').text(data.delay);\n" +
            "\t\t\t\t\t\t$('#ivRit').show();\n" +
            "\t\t\t\t\t} else {\n" +
            "\t\t\t\t\t\t$('#ivRit').hide();\n" +
            "\t\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\t\tif (data.onTimeInfo != ''){\n" +
            "\t\t\t\t\t\t$('#ivOnTime').html(data.onTimeInfo);\n" +
            "\t\t\t\t\t\t$('#ivOnTime').show();\n" +
            "\t\t\t\t\t} else {\n" +
            "\t\t\t\t\t\t$('#ivOnTime').hide()\n" +
            "\t\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\t\t$('#ivPartArr').html(data.tracktitle);\n" +
            "\n" +
            "\t\t\t\t\tif( data.categoria )\n" +
            "\t\t\t\t\t\tcat = '/PortaleFrecce/pages/images/infoviaggio/header/' + data.categoria + '.png';\n" +
            "\t\t\t\t\telse\n" +
            "\t\t\t\t\t\tcat = 'images/general/empty.png';\n" +
            "\n" +
            "\t\t\t\t\tvar catImage = $(\"<img>\");\n" +
            "\t\t\t\t\tcatImage.load(function(){\n" +
            "\t\t\t\t\t\t$('#ivClassifica img').attr('src', $(this).attr(\"src\"));\n" +
            "\t\t\t\t\t}).error(function(){\n" +
            "\t\t\t\t\t\t$('#ivClassifica img').attr('src', 'images/general/empty.png');\n" +
            "\t\t\t\t\t}).attr(\"src\",  cat);\n" +
            "\n" +
            "\t\t\t\t\t$('#footer').fadeIn();\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\telse {\n" +
            "\t\t\t\t\t$('#footer').fadeIn();\n" +
            "\t\t\t\t\t$('#ivNumTreno').text('');\n" +
            "\t\t\t\t\t$('#ivPartArr').html('');\n" +
            "\t\t\t\t\t$('#ivRit').text('');\n" +
            "\t\t\t\t\t$('#ivOnTime').text('');\n" +
            "\t\t\t\t\t$('#ivClassifica img').attr('src', cat);\n" +
            "\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\tif( data.isGpsValid ) {\n" +
            "\t\t\t\t\tresetGpsView(true);\n" +
            "\t\t\t\t\tif( data.speed === \"--\" )\n" +
            "\t\t\t\t\t\t$('#ivSpeed>div:only-child').fadeOut();\n" +
            "\t\t\t\t\telse\n" +
            "\t\t\t\t\t\t$('#ivSpeed>div:only-child').fadeIn();\n" +
            "\n" +
            "\t\t\t\t\t$('#ivSpeedValue').text(data.speed);\n" +
            "\t\t\t\t\t$('#ivLat').text(data.lat);\n" +
            "\t\t\t\t\t$('#ivLon').text(data.lon);\n" +
            "\t\t\t\t\t$('#ivAlt').text(data.alt);\n" +
            "\t\t\t\t\t$('#ivDir').text(data.dir);\n" +
            "\t\t\t\t}else if (data.isOdoValid) {\n" +
            "\t\t\t\t\t\tresetGpsView(false);\n" +
            "\t\t\t\t\t\t$('#ivSpeed>div:only-child').fadeIn();\n" +
            "\t\t\t\t\t\t$('#ivSpeedValue').text(data.speed);\n" +
            "\t\t\t\t} else {\n" +
            "\t\t\t\t\t\t$('#ivSpeed>div:only-child').fadeOut();\n" +
            "\t\t\t\t\t\tresetGpsView(false);\n" +
            "\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\tif( data.isM53Visible ) {\n" +
            "\t\t\t\t\t$('#m53menu').fadeIn();\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\telse {\n" +
            "\t\t\t\t\t$('#m53menu').fadeOut();\n" +
            "\t\t\t\t}\n" +
            "\t\t\t}\n" +
            "\t\t\telse {\n" +
            "\t\t\t\t$('#ivSpeed>div:only-child').fadeOut();\n" +
            "\t\t\t\tresetGpsView(false);\n" +
            "\t\t\t}\n" +
            "\t\t});\n" +
            "\t};\n" +
            "\n" +
            "\tvar footerMoveBy = 438;\n" +
            "\n" +
            "\t$('#buttonRight').click(function(event) {\n" +
            "\t\tvar left = $('.draggableY').position().left;\n" +
            "\t\t//var pWidth = $('#ivPercLine').width();\n" +
            "\t\tvar pWidth = $('#ivStationsListContainer').width() || $('#ivPercLine').width();\n" +
            "\t\tvar fWidth = $('#footer').width();\n" +
            "\n" +
            "\t\tif( pWidth + (left - footerMoveBy) < (fWidth / 2) )\n" +
            "\t\t\t$('.draggableY').animate({left: -pWidth + (fWidth / 2 ),speed: 'slow'});\n" +
            "\t\telse\n" +
            "\t\t\t$('.draggableY').stop().animate({\n" +
            "\t\t\t\tleft: (left - footerMoveBy)\n" +
            "\t\t\t});\n" +
            "\t});\n" +
            "\t$('#buttonLeft').click(function(event) {\n" +
            "\t\tvar left = $('.draggableY').position().left;\n" +
            "\t\t//var pWidth = $('#ivPercLine').width();\n" +
            "\t\tvar pWidth = $('#ivStationsListContainer').width();\n" +
            "\t\tvar fWidth = $('#footer').width();\n" +
            "\n" +
            "\t\tif( left + footerMoveBy > 15 )\n" +
            "\t\t\t$('.draggableY').animate({left: 15 ,speed: 'slow'});\n" +
            "\t\telse\n" +
            "\t\t\t$('.draggableY').stop().animate({\n" +
            "\t\t\t\tleft: (left + footerMoveBy)\n" +
            "\t\t\t});\n" +
            "\t});\n" +
            "\n" +
            "\t$(document).ready(function(){\n" +
            "\t\t$('map *').tooltip({track: true, position: {my: \"center bottom-10\"}});\n" +
            "\t});\n" +
            "\n" +
            "\tinfoviaggioFullPartInterval = setInterval('updateViaggio()', 3000);\n" +
            "\n" +
            "</script>\n" +
            "\n" +
            "\t\t\t</div>\n" +
            "\t\t</div>\n" +
            "\t</body>\n" +
            "\t<!-- ALMV_WIDGET_BODY_END -->\n" +
            "\n" +
            "</html>\n";
}
