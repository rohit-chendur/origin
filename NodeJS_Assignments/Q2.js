const fs = require('fs');

fs.readFile((__dirname,'/read-files/hello.java'),'utf8',
    (err,data)=>{
        if(err) throw err;
        console.log(data);
    }
)
