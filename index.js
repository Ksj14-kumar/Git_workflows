const express = require("express");

const port =  process.env.PORT || 5001;

const app = express();

app.get("/", async (req, res) => {
  try {
    res.send("Hii, server!!");
  } catch (err) {
    console.log("errpr on", err);
  }
});

app.listen(port, (err) => {
  if (err) throw new Error(err);
  console.log(`server is running on port: ${port}`);
});
