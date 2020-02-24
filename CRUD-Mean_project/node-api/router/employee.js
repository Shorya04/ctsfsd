const express = require('express');
const router = express.Router();
const Employee = require('../model/employee');

router.get('/:id', async (req, res) => {

    const employee = await Employee.findById(req.params.id);
    if (!employee) {

        res.status(404).json({
            error: true,
            message: "Employee with id " + id + " does not exist !"

        })
    }
    try {

        res.status(200).json({
            error: false,
            data: employee

        })
    }
    catch (err) {

        res.status(400).json({
            error: true,
            message: err.message


        });
    }
});


    router.get('/', async (req, res) => {

        const employees = await Employee.find();

        try {
            res.status(200).json({
                error: false,
                message: 'getting all employees succesfully!',
                data: employees

            });
        }

        catch (err) {
            res.status(400).json({
                error: true,
                message: err.message
            });
        }
    });


    router.post('/', async (req, res) => {

        const emp = req.body;
        console.log(emp)
        const doc = await Employee.create(emp)

        try {
            res.status(201).json({
                error: false,
                data: doc

            })
        }
        catch (err) {

            res.status(400).json({
                error: true,
                message: err.message,

            })
        }
    });

    router.put('/:id', async (req, res) => {

        const employee = await Employee.findByIdAndUpdate(req.params.id, req.body, {

            new: true,
            runValidators: true

        })
        if (!employee) {

            res.status(404).json({
                error: true,
                message: "Employee with id " + id + " does not exist !"

            })
        }
        try {

            res.status(200).json({
                error: false,
                data: employee

            })
        }
        catch (err) {

            res.status(400).json({
                error: true,
                message: err.message


            })
        }
    });



    router.delete('/:id', async (req, res) => {

        const employee = await Employee.findByIdAndDelete(req.params.id, req.body, {

            new: true,
            runValidators: true

        })

        if (!employee) {

            res.status(404).json({
                error: true,
                message: "Employee with id " + id + " does not exist !"

            })
        }
        try {

            res.status(200).json({
                error: false,
                data: employee

            })
        }
        catch (err) {

            res.status(400).json({
                error: true,
                message: err.message


            })
        }

    });

    module.exports = router;