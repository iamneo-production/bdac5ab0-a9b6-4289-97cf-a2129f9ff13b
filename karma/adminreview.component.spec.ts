import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AdminreviewComponent } from './adminreview.component';

describe('AdddetailsComponent', () => {
  let component: AdminreviewComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AdminreviewComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AdminreviewComponent);
    component = fixture.componentInstance;
  });
  it('FE_adminReview', () => {
    expect(component).toBeTruthy();
  });
});