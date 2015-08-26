$(document).ready(function () {

  var slide = 1;
  var slides = $("#slideshow-list li")
  var speed = 4800;

  function nextSlide() {
    $("#slide" + slide).css({"display": "none"});
    slide = slide === slides.length ? 1 : slide + 1;
    $("#slide" + slide).fadeIn({"display": "block"});
  }

  setInterval(nextSlide, speed);

  $("#menu-button").click(function() {
    $("#main-nav").animate({
      height: "toggle"
    }, 400, function() {});
  });
});
