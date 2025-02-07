const express = require('express')
const app = express();


app.use((req, res, next) => {
    console.log(`req params => ${req.method} and ${req.url}`)
})

// 2nd middleware with path
app.use('/asdf', (req, res, next) => {
    console.log(`req params => ${req.method} and ${req.url}`)
})

app.get('/app', () => {

})

app.listen(3000, () => {
    console.log("app started..")
})