<template>
  <div id="main">
  <div>
    <h1>Welcome to the Video Page!</h1>
  </div>
  <section class="vidholder">
    <iframe class="video" src=https://vimeo.com/event/2362252/embed allow="autoplay;" allowfullscreen></iframe>
    <iframe class ="chat" src=https://vimeo.com/event/2362252/chat/ height="100%" frameborder="0"></iframe>
  </section>
  </div>
  <!--<section>

    <iframe src=https://vimeo.com/event/2362252/chat/ width="100%" height="100%" frameborder="0"></iframe>
  </section>-->
</template>
<!--YOU can't add IFRAMES to .vue files-->
<!-- export default just means that you want this page to be exported and usable by other files"-->
<script>
import {db} from "../app";

export default {
  name: "VideoPage"
}
db.collection("stuff").add({
  "nepal":{
    "flag":"triangular",
    "sky": "blue"
  }
}).then(data=>console.log(data))
</script>

<style scoped>
main{

  height:1vh;
  width:1vw;

}
h1{
  color:chartreuse;
}
.vidholder{
  background:red;
  width:1000px;
  height:500px;
  display:flex;
  flex-flow:row nowrap;

}
vidholder *{

  height:100%;
}
.video{
  width:70%;
}
.chat{
  width:30%;
}
</style>