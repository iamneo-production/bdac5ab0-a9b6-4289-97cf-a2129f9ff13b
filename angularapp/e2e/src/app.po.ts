<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
import { browser, by, element } from 'protractor';

export class AppPage {
  navigateTo(): Promise<unknown> {
    return browser.get(browser.baseUrl) as Promise<unknown>;
  }

  getTitleText(): Promise<string> {
    return element(by.css('app-root .content span')).getText() as Promise<string>;
  }
}
<<<<<<< HEAD
=======
import { browser, by, element } from 'protractor';

export class AppPage {
  navigateTo(): Promise<unknown> {
    return browser.get(browser.baseUrl) as Promise<unknown>;
  }

  getTitleText(): Promise<string> {
    return element(by.css('app-root .content span')).getText() as Promise<string>;
  }
}
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
