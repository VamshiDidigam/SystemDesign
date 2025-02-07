const express = require('express');

const router = express.Router();

router.get('/', (req, res) => {
    res.send('accessed public router')
});

module.exports = router;