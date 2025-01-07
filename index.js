console.log("Hii, Mom");
console.log("added jenkins file");

const express = require("express");

const app = express();

app.get("/", async (req, res) => {
  try {
    res.send("Hii, server!!");
  } catch (errr) {
    console.log("errpr on", err);
  }
});

app.listen(5000, (err) => {
  if (err) throw new Error(err);
  console.log(`server is running on port: ${5000}`);
});
