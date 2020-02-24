const express= require('express');
const morgan = require('morgan');
const cors= require('cors');
const mongoose = require('mongoose');



mongoose.connect("mongodb://localhost:27017/employeedb", 
{
    useNewUrlParser: true,
    useUnifiedTopology: true
},
    err =>{

        if(err) {
            console.log("mongodb could not cannected!")
        }
        else{
            console.log("mongodb successfully connected!")
        }
        }
)
const employeeRoutes = require('./router/employee');
const app=express();

app.get('/',(req, res)=>{
    res.status(200).json({
    error: false,
    message: 'Api is running'
        
    })
})

// Middleware
app.use(cors());
app.use(morgan('dev'));
app.use(express.json());
app.use('/api/v1/employee', employeeRoutes);

const PORT= process.env.PORT || 4000;

app.listen(PORT, () => {
    console.log(`Server is running at PORT: ${PORT}`)
})

