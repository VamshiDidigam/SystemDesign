const express = require("express");
const app = express();

require("./router")(app);
app.get("/test", (req, res) => {
  res.send("RESPONSE");
});

app.use("/static", express.static("./static"));

app.listen("4000", () => {
  console.log("App started..🔥");
});
