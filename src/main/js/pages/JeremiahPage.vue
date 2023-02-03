<template>
  <div id="main" class="page">
    <div id="header" class="info-bar">
      <h1>{{ fhname }}</h1>
    </div>
    <div id="div1" class="sidebar">
      <div id="test1" class="sidebar-contents" @click="setFHName('FH 1')">
        <p>FH 1</p>
      </div>
      <div id="test2" class="sidebar-contents" @click="setFHName('FH 2')">
        <p>FH 2</p>
      </div>
      <div id="test3" class="sidebar-contents" @click="setFHName('FH 3')">
        <p>FH 3</p>
      </div>
      <div id="test4" class="sidebar-contents" @click="setFHName('FH 4')">
        <p>FH 4</p>
      </div>
      <div id="test5" class="sidebar-contents" @click="setFHName('FH 5')">
        <p>FH 5</p>
      </div>
      <div id="test6" class="sidebar-contents" @click="setFHName('FH 6')">
        <p>FH 6</p>
      </div>
      <div id="test7" class="sidebar-contents" @click="setFHName('FH 7')">
        <p>FH 7</p>
      </div>
      <div id="test8" class="sidebar-contents" @click="setFHName('FH 8')">
        <p>FH 8</p>
      </div>
      <div id="test9" class="sidebar-contents" @click="setFHName('FH 9')">
        <p>FH 9</p>
      </div>
    </div>
    <div id="vid-div" class="vid">
      <iframe src="https://vimeo.com/event/2362252/embed" allow="autoplay; fullscreen; picture-in-picture;"
              class="iframe-vid"></iframe>
    </div>
    <div id="info-bar" class="info-bar">
      <p>test 10</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "JeremiahPage",
  data(){
    return {
      fhname: 'test'
    }
  },
  methods:{
    setFHName(fhname) {
      this.fhname = fhname
    }
  }
}
</script>

<style scoped>

.page {
  display: flex;
  justify-content: space-around;
  flex-direction: row;
  flex-flow: wrap;
  height: 80%;

}

.sidebar {
  margin-left: 2%;
  width: 15%;
  display: flex;
  flex-direction: column;
  justify-content: space-around;
  background-color: #1a1a1a;
  border-radius: 10px;
}

.sidebar-contents {
  display: flex;
  color: rgb(255 255 255 / 87%);
  font-family: sans-serif;
  justify-content: center;
  text-decoration: none;
}

.sidebar-contents:hover{
  background-color: grey;
}

.vid {
  margin-right: 2%;
  width: 80%;
  background-color: #1a1a1a;
  border-radius: 10px;
}

.iframe-vid {
  width:100%;
  height: 100%;
  border-radius: 10px;
  border-color: #1a1a1a;
}

.info-bar {
  display: flex;
  color: rgb(255 255 255 / 87%);
  width: 96%;
  height: 10%;
  background-color: #1a1a1a;
  border-radius: 10px;
  font-family: sans-serif;
  justify-content: center;
  margin-top: 2%;
  margin-bottom: 2%;
}

</style>