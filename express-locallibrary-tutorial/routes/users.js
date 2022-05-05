
var express = require('express');
var router = express.Router();

router.get('/', function(req, res, next) {
  res.render('users', { title: 'Respond with a resource' });
});

router.get('/cool', function(req, res, next) {
  res.render('users', { title: 'Sorprendente' });
});

module.exports = router;
