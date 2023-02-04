<template>
  <div>
    <h1>Administration Login</h1>
    <body>
    <form action="">
      <h1>Admin Login</h1>
      <label for="username">Username:</label>
      <input type="text" id="username" name="username">

      <label for="password">Password:</label>
      <input type="password" id="password" name="password">

      <input type="submit" value="Login">
    </form>
    </body>
  </div>
</template>

<script>
export default {
  name: "AdminLogin"
}
</script>

<style scoped>

body {
  font-family: Arial, sans-serif;
  background-color: #f2f2f2;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

form {
  background-color: #fff;
  padding: 40px;
  border-radius: 10px;
  box-shadow: 2px 2px 10px #ccc;
  width: 400px;
}

h1 {
  text-align: center;
  margin-bottom: 30px;
}

input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 20px;
  border: none;
  border-radius: 5px;
  font-size: 16px;
}

input[type="submit"] {
  width: 100%;
  padding: 10px;
  background-color: blue;
  color: #fff;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
}

input[type="submit"]:hover {
  background-color: darkblue;
}

</style>