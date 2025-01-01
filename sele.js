const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

// Define a GET route
app.get('/', (req, res) => {
    res.send('<h1>Hello World, this is Hasini</h1>');
});

// Export the app (DO NOT call app.listen here)
module.exports = app;






process.env.PORT = 3000;

const { Builder, By, until } = require('selenium-webdriver');
const assert = require('assert');
const app = require('./app'); // Import the Express app

(async function example() {
    // Start the server
    const server = app.listen(process.env.PORT, () => {
        console.log(`Test server running on http://localhost:${process.env.PORT}`);
    });

    let driver = await new Builder().forBrowser('chrome').build();
    try {
        // Open the application URL
        await driver.get(`http://localhost:${process.env.PORT}`);

        // Locate the <h1> tag and get its text content
        const element = await driver.wait(until.elementLocated(By.tagName('h1')), 10000);
        const text = await element.getText();

        // Assert the text content is correct
        assert.strictEqual(text, 'Hello World, this is Hasini');
        console.log('Test passed: Page contains "Hello World, this is Hasini"');
    } catch (error) {
        console.error('Test failed:', error);
    } finally {
        // Close the browser and stop the server
        await driver.quit();
        server.close(); // Gracefully stop the server
    }
})();
