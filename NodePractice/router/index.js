const publicRoutes = require('./public');
const privateRoutes = require('./private');

module.exports = (app) => {

    app.use('/public', publicRoutes);
    app.use('/private', privateRoutes);
    
    return app;
}