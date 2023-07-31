<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
<<<<<<< HEAD
=======
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';


platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
>>>>>>> d6e745b12f0d7edfee44d4d32c67e0b84b1524b6
=======
>>>>>>> 4aafdc273be4895981963330f0040cf86eb0b9c4
