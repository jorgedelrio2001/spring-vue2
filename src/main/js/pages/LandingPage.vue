<template>
<div class="container">
    <div class = "form">
        <h1>Encore (working title)</h1>
        <h3>Enter Passcode</h3>
        <input type="text" id="username" name="username" placeholder="Passcode">

        <br>
        <input type="submit" value="View Stream" @click="goToHomePage">
        <button @click="goToAdminLogin">Log in as admin</button>
    </div>
</div>
</template>

<script>
export default {
  name: "LandingPage",
  methods: {
    goToHomePage() {
      this.$router.push('/stream')
    },
    goToAdminLogin(){
      this.$router.push('/admin-login')
    }
  }
}
</script>

<style scoped>

</style>