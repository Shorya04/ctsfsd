import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TwobindingComponent } from './twobinding.component';

describe('TwobindingComponent', () => {
  let component: TwobindingComponent;
  let fixture: ComponentFixture<TwobindingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TwobindingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TwobindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
