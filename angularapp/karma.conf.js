<<<<<<< HEAD
<<<<<<< HEAD
// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html

module.exports = function (config) {
  config.set({
    basePath: '',
    frameworks: ['jasmine', '@angular-devkit/build-angular'],
    plugins: [
      require('karma-jasmine'),
      require('karma-chrome-launcher'),
      require('karma-jasmine-html-reporter'),
      require('karma-coverage-istanbul-reporter'),
      require('@angular-devkit/build-angular/plugins/karma')
    ],
    client: {
      clearContext: false // leave Jasmine Spec Runner output visible in browser
    },
    coverageIstanbulReporter: {
      dir: require('path').join(__dirname, './coverage/angularapp'),
      reports: ['html', 'lcovonly', 'text-summary'],
      fixWebpackSourcePaths: true
    },
    reporters: ['progress', 'kjhtml'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['Chrome'],
    singleRun: false,
    restartOnFileChange: true
  });
};
=======
// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html
process.env.CHROME_BIN = require('puppeteer').executablePath()
=======
// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html

>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
module.exports = function (config) {
  config.set({
    basePath: '',
    frameworks: ['jasmine', '@angular-devkit/build-angular'],
    plugins: [
      require('karma-jasmine'),
      require('karma-chrome-launcher'),
      require('karma-jasmine-html-reporter'),
<<<<<<< HEAD
      require('karma-coverage'),
=======
      require('karma-coverage-istanbul-reporter'),
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
      require('@angular-devkit/build-angular/plugins/karma')
    ],
    client: {
      clearContext: false // leave Jasmine Spec Runner output visible in browser
    },
<<<<<<< HEAD
    jasmineHtmlReporter: {
      suppressAll: true // removes the duplicated traces
    },
    reporters: ['progress'],
=======
    coverageIstanbulReporter: {
      dir: require('path').join(__dirname, './coverage/angularapp'),
      reports: ['html', 'lcovonly', 'text-summary'],
      fixWebpackSourcePaths: true
    },
    reporters: ['progress', 'kjhtml'],
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
<<<<<<< HEAD
    browsers: ['ChromeHeadless'],
    singleRun: true,
    restartOnFileChange: false
  });
};
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
=======
    browsers: ['Chrome'],
    singleRun: false,
    restartOnFileChange: true
  });
};
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
