import { AppPage } from './app.po';

describe('angular-test App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should show tasks', () => {
    page.navigateTo();
  });
});
