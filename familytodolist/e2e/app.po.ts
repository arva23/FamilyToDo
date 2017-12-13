import { browser, by, element } from 'protractor';
import { ElementFinder } from 'protractor/built/element';

export class AppPage {
  navigateTo() {
    return browser.get('/');
  }
}
