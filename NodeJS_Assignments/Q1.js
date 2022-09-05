const fs = require('fs');
const path = require('path');

//CREATE DIRECTORY
 
fs.mkdir(path.join(__dirname, 'Training Details'), 
    (err) => {
        if (err) {
            return console.error(err);
        }
    console.log('Directory created successfully!');
    }
);


//CREATE AND WRITE FILE

fs.writeFile(path.join(__dirname,'/Training Details','/StudentName.txt')
    ,'Rohit Chendur, 22851'
    ,(err)=>{
        if(err) throw err;
        console.log('File written to....');
    }
)


//READ FILE
fs.readFile(path.join(__dirname,'/Training Details','/StudentName.txt')
    ,'utf8'
    ,(err,data)=>{
        if(err) throw err;
        console.log(data);
    }
)

