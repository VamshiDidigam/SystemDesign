const fs = require('fs')

console.log(__dirname)
fs.readFile(__dirname+'/text.txt', 'utf-8', (err, data) => {
    if(err) {
        console.error('Error reading file:', err);
        return;
    }

    console.log(data)
})