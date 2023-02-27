<template>
    <div class="container">
        <div class = "form">
            <h1>Administration Login</h1>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username">
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
            <br>
            <input type="submit" value="Login">
        </div>
    </div>
</template>

<script>
fetch("./api")
export default {
  name: "AdminLogin"
}
</script>

<style scoped>

</style>